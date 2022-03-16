import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("������� ������:");
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
            System.out.println("���������� ���������� �����: 0 ����� ����������� �� �����: "
                    + Timer.getTimeInMS());
        } else {
            System.out.println("���������� ���������� �����: "
                    + result.size() + " ����� ����������� �� �����: "
                    + Timer.getTimeInMS());
        }
    }
}
