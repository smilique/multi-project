package com.epam.lab;

public class Utils {

    private final StringUtils stringUtils = new StringUtils();

    boolean isAllPositiveNumbers (String... str) {

        boolean result = true;
        for (String s : str) {
            if (!stringUtils.isPositiveNumber(s)) {
                result = false;
            }
        }

        return result;
    }
}
