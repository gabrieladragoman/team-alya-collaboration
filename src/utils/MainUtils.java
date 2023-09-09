package utils;

public class MainUtils {
    public static void main(String[] args) {
        System.out.println("\nHello Team Alya! Joke of the day:\n");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Why did the private classes break up?");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.err.println("Because they never saw each other.");
    }
}