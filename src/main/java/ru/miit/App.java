package ru.miit;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import ru.miit.services.GFC;
import ru.miit.services.SymmetricChecker;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        Collection arr = container.select(Collection.class).get();

        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.remove(1);

//        System.out.println(SymmetricChecker.symmetricHelper(arr.convertIntegers(), (int)arr.getSize(), 0));
//        System.out.println(GFC.countUniqueValues(arr.convertIntegers()));

        container.shutdown();
    }
}
