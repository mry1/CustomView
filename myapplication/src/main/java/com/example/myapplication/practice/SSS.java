package com.example.myapplication.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by louis2 on 18-2-27.
 */

public class SSS {
    public static void main(String[] args) {
        String[] input = {"you", "are", "my", "super", "star"};
        List<String> list = (List<String>) Arrays.asList(input);
        int i;
        System.out.println(list);

        Collections.sort(list);
        int j;

        System.out.println(list);

    }

}
