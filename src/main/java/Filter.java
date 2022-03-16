import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Filter {
    public static List<String> doFilter(BufferedReader file, int column, String filter){
        return file.lines()
                .filter(x -> x
                        .split(",")[column]
                        .contains(filter))
                .sorted(Comparator.comparing(x -> x
                        .split(",")[column]))
                .collect(Collectors.toList());
    }
}
