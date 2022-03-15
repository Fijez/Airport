import java.io.*;

public final class ReadFromFile {
private static BufferedReader in;

    static {
        try {
            in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/main/resources/airports.dat")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String readLine(){
        try {
            return in.readLine();
        } catch (IOException e) {
            System.err.println("ошибка чтения строки из файла");
            e.printStackTrace();
        }
        return "null";
    }
    public static void closeFile() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
