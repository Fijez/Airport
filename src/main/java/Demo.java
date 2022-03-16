import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset().displayName());
        System.out.println("������� ������:");
        String filter = InputData.getInput();
        Integer column = YamlRunner.getYamlData();
        System.gc();
        List<String> result = null;
        StringBuilder[] str = new StringBuilder[1000];
        long timer = 0;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/main/resources/airports.dat")))){
            Timer.startTimer();
            result = Filter.doFilter(in, column, filter);
            timer = Timer.stopTimerAndGetResultInNanoseconds();
            result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result == null) {
            System.out.println("���������� ���������� �����: 0 ����� ����������� �� �����: "
                    + Timer.stopTimerAndGetResultInNanoseconds());
        } else {
            System.out.println("���������� ���������� �����: "
                    + result.size() + " ����� ����������� �� �����: "
                    + timer);
        }
    }
}
