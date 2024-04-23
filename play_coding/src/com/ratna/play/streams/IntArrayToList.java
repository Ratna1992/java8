package com.ratna.play.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayToList {
    public static void main(String[] args) {
        //convert int[] to List
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> collect2 = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(collect2);
    }
}
