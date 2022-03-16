import java.io.*;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset().displayName());
        System.out.println("Введите строку:");
        String filter = InputData.getInput();
        Integer column = YamlRunner.getYamlData();
        System.gc();
        List<String> result = null;
        StringBuilder[] str = new StringBuilder[1000];
        long timer = 0;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/main/resources/airports.dat")))){
            Timer.startTimer();
            result =
                    in.lines()
                    .filter(x -> x
                            .split(",")[column]
                            .contains(filter))
                    .sorted(Comparator.comparing(x -> x
                            .split(",")[column]))
                    .collect(Collectors.toList());
            timer = Timer.stopTimerAndGetResultInNanoseconds();
            result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result == null) {
            System.out.println("Количество найденныйх строк: 0 Время затарченное на поиск: "
                    + Timer.stopTimerAndGetResultInNanoseconds());
        } else {
            System.out.println("Количество найденныйх строк: "
                    + result.size() + " Время затарченное на поиск: "
                    + timer);
        }
    }
}
