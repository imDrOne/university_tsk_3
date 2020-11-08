package ru.miit.services;

import java.util.ArrayList;

public class SymmetricChecker {
    public static boolean symmetricHelper(ArrayList<Integer> A, int i) {
        int size = A.size();

        if (i > size/2)
            return true;

        else if (!A.get(i).equals(A.get(size - 1 - i)))
            return false;

        else
            return symmetricHelper(A, i+1);
    }
}
