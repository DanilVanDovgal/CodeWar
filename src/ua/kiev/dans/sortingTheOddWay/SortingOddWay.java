package ua.kiev.dans.sortingTheOddWay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingOddWay {
    static<T extends Number & Comparable<? super T>> Object[] sortingOddWay(final T[] source) {
        if (source.length <= 1) {
            return source;
        }

        List<T> oddList = new ArrayList<>();
        List<T> evenList = new ArrayList<>();

        for (T d : source) {
            if ((d.intValue() % 2) == 0) {
                evenList.add(d);
            } else {
                oddList.add(d);
            }
        }

        evenList.sort(Comparator.reverseOrder());
        oddList.sort(Comparator.naturalOrder());
        oddList.addAll(evenList);

        return oddList.toArray();
    }
}
