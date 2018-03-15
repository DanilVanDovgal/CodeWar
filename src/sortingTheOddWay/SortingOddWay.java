package sortingTheOddWay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingOddWay {
    static Double[] sortingOddWay(final Double source[]) {
        if (source.length <= 1) {
            return source;
        }

        List<Double> oddList = new ArrayList<>();
        List<Double> evenList = new ArrayList<>();

        for (Double d : source) {
            if ((d.intValue() % 2) == 0) {
                evenList.add(d);
            } else {
                oddList.add(d);
            }
        }

        evenList.sort(Comparator.reverseOrder());
        oddList.sort(Comparator.naturalOrder());
        oddList.addAll(evenList);
        Double result[] = new Double[oddList.size()];

        return oddList.toArray(result);
    }
}
