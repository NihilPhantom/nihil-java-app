package com.nihil.common.utils;

public class SqlUtils {
    public static String injectFilter(String s){
            if (s == null) return null;
            return s.replaceAll("%", "\\\\%")
                    .replaceAll("_", "\\\\_");
    }
}
