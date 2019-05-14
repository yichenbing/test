package com.ycbbcy.test.utils;

/**
 * 数组工具类
 */
public class ArrayUtils {

    private ArrayUtils() {
        // 工具类
    }

    /**
     * 数组转字符串
     *
     * @param arrays 数组
     * @param split  分隔符
     * @return 字符串
     */
    public static String join(Object[] arrays, String split) {
        if (arrays == null || arrays.length <= 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();

        for (Object array : arrays) {
            builder.append(split).append(array == null ? null : array.toString());
        }
        return builder.substring(1, builder.length());
    }
}
