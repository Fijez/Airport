public final class Timer {

    private static long start;
    private static long finish;
    private static long elapsed;

    public static void startTimer() {
        start = System.nanoTime();
    }

    public static long stopTimerAndGetResultInNanoseconds() {
        finish = System.nanoTime();
        elapsed = finish - start;
        return elapsed /= 1000000;
    }
}
