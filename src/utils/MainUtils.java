package utils;

public class MainUtils {
    public static void main(String[] args) {
        System.out.println("\nHello Team Alya! Joke of the day:\n");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*System.out.println("Why did the private classes break up?");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.err.println("Because they never saw each other.");*/


        System.out.println("The Definition of an Upgrade: ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Take old bugs out, put new ones in.");
    }
}