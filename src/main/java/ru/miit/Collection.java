package ru.miit;

import ru.miit.annotation.Added;
import ru.miit.annotation.Removed;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;

@Named
public class Collection {
    private final ArrayList<Integer> arrayList = new ArrayList<>();

    @Inject
    @Added
    private Event<ArrayList<Integer>> eventAdd;

    @Inject
    @Removed
    private Event<ArrayList<Integer>> eventRemove;

    public Collection() {
        super();
    }

    public void add(Integer item) {
        arrayList.add(item);
        eventAdd.fire(arrayList);
    }

    public void remove(Integer item) {
        arrayList.remove(item);
        eventRemove.fire(arrayList);
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public long getSize() {
        return arrayList.size();
    }

    public int[] convertIntegers() {
        int[] ret = new int[arrayList.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arrayList.get(i);
        }
        return ret;
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
