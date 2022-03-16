import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        String filter = InputData.getInput();
        Integer column = YamlRunner.getYamlData();
        System.gc();
        List<String> result = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/main/resources/airports.dat")))){
            Timer.startTimer();
            result = Filter.doFilter(in, column, filter);
            Timer.stopTimer();
            result.forEach(System.out::println);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result == null) {
            System.out.println("Количество найденныйх строк: 0 Время затарченное на поиск: "
                    + Timer.getTimeInMS());
        } else {
            System.out.println("Количество найденныйх строк: "
                    + result.size() + " Время затарченное на поиск: "
                    + Timer.getTimeInMS());
        }
    }
}
