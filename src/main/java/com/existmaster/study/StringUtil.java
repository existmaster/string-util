package com.existmaster.study;

/**
 * Created by existmaster on 2015. 12. 6..
 */
public class StringUtil {

    public String convertIntToString(int value, int digit) {
        String result = Integer.toString(value);
        if (result.length() > digit) throw new IllegalArgumentException();

        while (result.length() < digit) {
            result = "0" + result;
        }

        return result;
    }
}
