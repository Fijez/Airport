import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public final class Filter {
    public static List<String> doFilter(BufferedReader file, int column, String filter) throws IOException {
        Pattern pattern = Pattern.compile(",");
        List<String> str = new LinkedList<>();
        String temp = file.readLine();
        while(temp != null) {
            if (temp.split(pattern.pattern())[column].contains(filter)) {
                str.add(temp);
            }
            temp = file.readLine();
        }
        return str;
    }
}
