package com.xiyou.java.utils;

import java.util.Calendar;

public class TimeUtil {

    /**
     * 获取当前月份的季度数
     *
     * @return
     */
    public static String getYearWithSeason() {
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH) + 1;
        String year = String.valueOf(now.get(Calendar.YEAR));

        if (month == 1 | month == 2 || month == 3) {
            // 新一年的第一天仍然算上一年的最后一季度
            // 即 2020年1月1日实际上为2020 年的第一季度 ，但是由于这一天导出的数据是2019年12月31号
            // 的数据该数据仍然需要存储在2019-4 文件夹中。因此需要特殊处理
            if (month == 1 && now.get(Calendar.DATE) == 1) {
                Integer ye = Integer.parseInt(year) - 1;
                return ye + "-" + "4";
            }
            return year + "-" + "1";
        } else if (month == 4 || month == 5 || month == 6) {
            //新一季度的第一天仍然按照上一季度对待
            if (month == 4 && now.get(Calendar.DATE) == 1) {
                return year + "-" + "1";
            }
            return year + "-" + "2";
        } else if (month == 7 || month == 8 || month == 9) {
            if (month == 7 && now.get(Calendar.DATE) == 1) {
                return year + "-" + "2";
            }
            return year + "-" + "3";
        } else if (month == 10 || month == 11 || month == 12) {
            if (month == 10 && now.get(Calendar.DATE) == 1) {
                return year + "-" + "3";
            }
            return year + "-" + "4";
        }
        return "";
    }

    /**
     * 每月的第一天不创建新的文件， 数据【上一季度的最后一天的数据】仍然存储在上个季度的文件。
     */
    public static void test() {
        //返回年份与季度数
        String yearWithSeason = getYearWithSeason();
        System.out.println(yearWithSeason);
    }

    public static void main(String[] args) {
        test();
    }
}