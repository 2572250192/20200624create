package com.gec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        List<Integer> list1 = Collections.synchronizedList(list);
        for (Integer integer : list1) {
            System.out.println(integer);
        }

    }
}
