package ru.miit;

import ru.miit.services.GFC;
import ru.miit.services.SymmetricChecker;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(4);
        arr.add(1);
        System.out.println(SymmetricChecker.symmetricHelper(arr, 0));
        System.out.println(GFC.countUniqueValues(arr));
    }
}
