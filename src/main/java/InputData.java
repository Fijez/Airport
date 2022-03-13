import java.util.Scanner;

public final class InputData {
    public static String getInput() {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        in.close();
        return temp;
    }
}
