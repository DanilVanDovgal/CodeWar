package rainfall;

import java.util.Arrays;

public class RainFall {

    public static double mean(String town, String strng) {

        String tempCityData = townExist(town, strng);

        if (tempCityData == null)
            return -1;

        return Arrays.stream(tempCityData.split(","))
                .mapToDouble(Double::parseDouble)
                .average()
                .getAsDouble();
    }

    public static double variance(String town, String strng) {

        double average = mean(town, strng);

        if (average == -1)
            return -1;

        String tempCityData = townExist(town, strng);

        return Arrays.stream(tempCityData.split(","))
                .mapToDouble(Double::parseDouble)
                .map(a -> Math.pow(a - average, 2))
                .average().getAsDouble();
    }

    private static String townExist(String town, String source) {

        for (String s : source.split("\n")) {
            if ((s.substring(0, s.indexOf(":")).equals(town))) {
                return s.replaceAll("[a-zA-Z:\\p{Blank}]", "");
            }
        }

        return null;
    }

}
