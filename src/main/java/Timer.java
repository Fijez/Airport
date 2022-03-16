public final class Timer {

    private static long start;
    private static long finish;
    private static long elapsed;

    public static void startTimer() {
        start = System.nanoTime();
    }

    public static void stopTimer() {
        finish = System.nanoTime();
        elapsed = finish - start;
        elapsed /= 1000000;
    }

    public static long getTimeInMS() {
        return elapsed;
    }
    public static long timeInMoment(){
        return (System.nanoTime() - start)/ 1000000;
    }
}
