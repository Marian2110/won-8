package com.accenture.day8.dsadsad;

import com.accenture.day6.homework.MaxValues;

import java.util.List;

public class TDD {
    public MaxValues max(List<Integer> list) {
        if (list != null && list.size() > 1) {
            int max = 0;
            for (  int item: list) {
                if (item > max) {
                    max = item;
                }
            }
            return new MaxValues(max, list.get(0));
        }
        return null;
    }
}
