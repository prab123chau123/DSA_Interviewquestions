package com.pratice.DSA;

import java.util.ArrayList;
import java.util.List;

public class FlatData {
    public static void main(String[] args) {
        Object[] arr = { 1, 2, new Object[] { 2, 3, new Object[] { 1, 3, 1 }, 2, 4 }, 3, 8 };
        List<Object> output = new ArrayList<>();
        getData(output, arr);
        System.out.println(output);
    }

    private static void getData(List<Object> result, Object[] arr) {
        for (Object element : arr) {
            if (element instanceof Object[]) {
                getData(result,(Object[])element);
            } else {
                result.add(element);
            }
        }
    }
}
