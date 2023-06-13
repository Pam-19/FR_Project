package LockedMe_Project;

import java.util.Scanner;

public class InputScanner {
    private static Scanner scanner;

    private InputScanner() {
        // Private constructor to prevent instantiation
    }

    public static void initialize() {
        scanner = new Scanner(System.in);
    }

    public static int nextInt() {
        return scanner.nextInt();
    }
    public static String nextLine() {
        return scanner.nextLine();
    }
    public static void close() {
        scanner.close();
    }
}
