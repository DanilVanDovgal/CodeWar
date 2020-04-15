package ua.kiev.dans.sortArrayByValueAndIndex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortArrayByValueAndIndex {

    //FIRST VARIANT
    static int[] sortArrayByValueAndIndex(final int[] source) {
        if (source.length <= 1) {
            return source;
        }

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < source.length; i++) {
            integerList.add(source[i] * (i + 1));
        }

        integerList.sort(Comparator.naturalOrder());

        int[] result = new int[source.length];
        int index;

        for (int i = 0; i < source.length; i++) {
            index = integerList.indexOf(source[i] * (i + 1));
            result[index] = source[i];
            integerList.set(index, null);
        }

        return result;
    }

    //SECOND VARIANT
    static int[] sortArrayByValueAndIndexStream(final int[] source) {
        if (source.length <= 1) {
            return source;
        }

        return IntStream.range(0, source.length)
                .boxed()
                .sorted(Comparator.comparingInt(a -> source[a] * (a + 1)))
                .mapToInt(b -> source[b])
                .toArray();
    }
}
