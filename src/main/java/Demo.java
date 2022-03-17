import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        String filter = InputData.getInput();
        Integer column = YamlRunner.getYamlData();
        System.gc();
        List<String> result = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/main/resources/airports.dat")))) {
            Timer.startTimer();
            result = Filter.doFilter(in, column, filter);
            Timer.stopTimer();
            result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Количество найденныйх строк: "
                + (result != null ? result.size() : 0) + " Время затарченное на поиск: "
                + Timer.getTimeInMS() + "мс");
    }
}
