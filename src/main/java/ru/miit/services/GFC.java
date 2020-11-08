package ru.miit.services;

import java.util.ArrayList;


public class GFC {
    public static Long countUniqueValues(ArrayList<Integer> strs) {
        return strs.stream().distinct().count();
    }
}
