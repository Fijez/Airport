import java.io.*;
import java.util.Objects;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        System.out.println("¬ведите строку:");
        String filter = InputData.getInput();
        Timer.startTimer();
        Integer column = YamlRunner.getYamlData();
        System.gc();

        StringBuilder[] str = new StringBuilder[1000];
        for (int i = 0; i < 1000; i++) {
            str[i] = new StringBuilder(ReadFromFile.readLine());
        }

        long usedMBytes = (Runtime.getRuntime().totalMemory()
                -Runtime.getRuntime().freeMemory())/1048576;
        System.out.println("used memory = " + usedMBytes);
        System.out.println("time = " + Timer.stopTimerAndGetResultInNanoseconds());
    }
}
