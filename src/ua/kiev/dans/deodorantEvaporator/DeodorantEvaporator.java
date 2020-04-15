package ua.kiev.dans.deodorantEvaporator;

public class DeodorantEvaporator {

    static int evaporator(double content, double evap_per_day, double threshold) {
        int day = 0;
        double minLevel = content * threshold / 100;

        while (content > minLevel) {
            day++;
            content = content - content * evap_per_day / 100;
        }

        return day;
    }
}
