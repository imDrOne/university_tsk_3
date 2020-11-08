package ru.miit.services;

import ru.miit.annotation.Added;

import javax.enterprise.event.Observes;
import java.util.ArrayList;

public class SymmetricChecker {
    public void symmetricHelper(@Observes @Added ArrayList<Integer> A) {
        int size = A.size();

        for (int j = 0; j < size; j++) {
            if (!A.get(j).equals(A.get(size - 1 - j))) {
                System.out.println("Array is not symmetric: " + A.toString());
                return;
            }
        }
        System.out.println("Array is symmetric: " + A.toString());
    }

    public void testObserver(@Observes String msg) {
        System.out.println(msg);
    }
}
