package com.tw;

import java.util.Arrays;

public class StringCalculator {
    public int add(String string) {
        return Arrays.stream(string.split("[^0-9]")).filter(element -> {
                    try {
                        Integer.parseInt(element);
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                }).map(element -> Integer.parseInt(element))
                .reduce((num1, num2) -> Integer.sum(num1, num2))
                .orElse(0);
    }
}
