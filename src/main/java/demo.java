import java.io.*;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        System.out.println("¬ведите строку:");
        String filter = InputData.getInput();
        Timer.startTimer();
        long start = System.nanoTime();

        int column = YamlRunner.getYamlData();

        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/airports.dat")));
            StringBuilder[] str = new StringBuilder[1000];
            for (int i = 0; i < 1000; i++) {
                str[i] = new StringBuilder(in.readLine());
            }
            long usedMBytes = (Runtime.getRuntime().totalMemory()
                    -Runtime.getRuntime().freeMemory())/1048576;
            System.out.println("used memory = " + usedMBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("time = " + Timer.stopTimerAndGetResultInNanoseconds());
    }
}
