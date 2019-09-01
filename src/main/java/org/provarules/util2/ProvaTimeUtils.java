package org.provarules.util2;

public class ProvaTimeUtils {

    static private final String[][] TIME_PERIODS = {{"d", "day", "days"}, {"h", "hour", "hours"}, {"m", "min", "minute", "minutes"}, {"s", "sec", "seconds"}, {"ms", "msec", "millis", "milliseconds"}};

    static private final long[] TIME_PERIODS_MULTIPLIERS = {86400 * 1000L, 3600 * 1000L, 60 * 1000L, 1000L, 1L};

    public static long timeIntervalInMilliseconds(final Object o) {
        try {
            final String text = o.toString();
            final String[] s = text.split(" ");
            if (s.length == 1)
                return Long.parseLong(text);
            return timeIntervalInMilliseconds(0L, text, s, 0, 0);
        } catch (Exception e) {
            throw new RuntimeException("Incorrect time period format: " + o);
        }
    }

    private static long timeIntervalInMilliseconds(final long total, final String text, final String[] s, final int soffset, final int offset) {
        long number = Long.parseLong(s[soffset]);
        for (int i = offset; i < TIME_PERIODS.length; i++) {
            for (String t : TIME_PERIODS[i]) {
                if (t.equals(s[soffset + 1])) {
                    long current = total + number * TIME_PERIODS_MULTIPLIERS[i];
                    return i == 4 || soffset + 2 == s.length ? current : timeIntervalInMilliseconds(current, text, s, soffset + 2, i + 1);
                }
            }
        }
        throw new RuntimeException("Incorrect time period format: " + text);
    }

}
