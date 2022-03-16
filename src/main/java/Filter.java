import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Filter {
    public static List<String> doFilter(BufferedReader file, int column, String filter) throws IOException {
        Pattern pattern = Pattern.compile(",");
        List<String> str = new ArrayList<>();
        String temp = file.readLine();
        while(temp != null) {
            if (temp.split(pattern.pattern())[column].contains(filter)) {
                str.add(temp);
            }
            temp = file.readLine();
        }
        return str;
//        return file.lines()
//                .filter(x -> x
//                        .split(pattern.pattern())[column]
//                        .contains(filter))
//                .sorted(Comparator.comparing(x -> x
//                        .split(",")[column]))
//                .collect(Collectors.toList());
    }
}
