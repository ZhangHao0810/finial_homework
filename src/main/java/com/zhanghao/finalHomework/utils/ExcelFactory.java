package com.zhanghao.finalHomework.utils;

/**
 * @author ZhangHao
 * @date 2019/12/28 10:14
 * @Description： 生成Excel的工具类
 */

import com.zhanghao.finalHomework.model.AllCompMessage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Excel 工厂类，负责 Workbook 的生成和解析
 */
public class ExcelFactory {
    /**
     * 构造 Workbook 对象，具体实例化哪种对象由 type 参数指定
     *
     * @param data 要导出的数据
     * @param type Excel 生成方式
     * @return 对应 type 的工作簿实例对象
     * @throws Exception 反射生成对象时出现的异常
     *                   <li>InstantiationException</li>
     *                   <li>IllegalAccessException</li>
     *                   <li>InstantiationException</li>
     */
    public static Workbook createExcel(List<AllCompMessage> data, String type)
            throws Exception {
        //根据 type 参数生成工作簿实例对象
        Workbook workbook = (Workbook) Class.forName(type).newInstance();
        //这里还可以指定 sheet 的名字
        Sheet sheet = workbook.createSheet("全部比赛信息");
//        Sheet sheet = workbook.createSheet();
        // 限定列数
        int cols = 9;
        int rows = data.size() - 1;
        int index0 = 0;
        int index = 0;
        Row row0 = sheet.createRow(0);

        ArrayList<String> first = new ArrayList<>();
        first.add("比赛名称");
        first.add("带队老师");
        first.add("比赛类别");
        first.add("比赛项目");
        first.add("成果基数");
        first.add("成果系数");
        first.add("比赛时间");
        first.add("参赛学生数");
        first.add("教师工作量(基数*系数*学生数)");

        for (int colNum = 0; colNum < cols; colNum++) {
            Cell cell = row0.createCell(colNum);
            cell.setCellValue(first.get(index0++));
        }
        /** 2019/12/29 10:29
         * 对导出excel进行了大改,利用了反射进行值得获取.
         */

        int rowNum = 1;

        for (AllCompMessage datum : data) {
            Row row = sheet.createRow(rowNum);
//            通过反射获得对象的属性值.
            Field[] field = datum.getClass().getDeclaredFields();
            int colNum = 0;
            //遍历所有属性
            for (Field aField : field) {
                //获取属性名称
                String fname = aField.getName();
//                因为我的get的首字母是大写的,所以这里要将fname的首字母大写再赋值回去.
                char[] ch = fname.toCharArray();
                if (ch[0] >= 'a' && ch[0] <= 'z') {
                    ch[0] = (char) (ch[0] - 32);
                }
                fname = new String(ch);

                Method m = datum.getClass().getMethod("get" + fname);
//                获取属性的类型
                String ftype = aField.getGenericType().toString();
                if ("class java.math.BigDecimal".equals(ftype)) {
                    //利用反射原理，调用getter方法获取属性值
                    BigDecimal value = (BigDecimal) m.invoke(datum);

                    Cell cell = row.createCell(colNum);
                    cell.setCellValue(value.toString());
                } else if ("class java.util.Date".equals(ftype)) {
                    Date value = (Date) m.invoke(datum);

                    Cell cell = row.createCell(colNum);
                    cell.setCellValue(value.toString());
                } else if ("class java.lang.Integer".equals(ftype)) {
                    Integer value = (Integer) m.invoke(datum);

                    Cell cell = row.createCell(colNum);
                    cell.setCellValue(value.toString());
                }else if ("class java.lang.Double".equals(ftype)) {
                    Double value = (Double) m.invoke(datum);

                    Cell cell = row.createCell(colNum);
                    cell.setCellValue(value.toString());
                }else  {
                    String value = (String) m.invoke(datum);

                    Cell cell = row.createCell(colNum);
                    cell.setCellValue(value);
                }
                colNum++;
            }

            rowNum++;
        }

        return workbook;
    }
}
