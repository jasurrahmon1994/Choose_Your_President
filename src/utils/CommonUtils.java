package utils;
import java.util.Scanner;

public class CommonUtils {
    
    public static int scannerInt(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        int inputInt = scanner.nextInt();
        return inputInt;
    }

    public static String scannerString(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        String inputString = scanner.nextLine();
        return inputString;
    }
}
