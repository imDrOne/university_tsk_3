package ru.miit.services;

import ru.miit.annotation.Removed;

import javax.enterprise.event.Observes;
import java.util.ArrayList;


public class GFC {
    public void countUniqueValues(@Observes @Removed ArrayList<Integer> srcArr) {
        long result = srcArr.stream().distinct().count();
        System.out.println(srcArr);
        System.out.println("Counts of unique: " + result);
    }
}
