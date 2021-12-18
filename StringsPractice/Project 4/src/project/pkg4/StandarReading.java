

import java.util.Scanner;

public class StandarReading {
   public static String readString(String message){
        String words;
        System.out.print(message);
        try (Scanner input = new Scanner(System.in)) {
            words = input.nextLine();
        }
        return words;
    }
    
    public static int readInt(String message){
        int number;
        System.out.print(message);
        try (Scanner input = new Scanner(System.in)) {
            number = input.nextInt();
        }
        return number;
    }
    public static int readIntTryCatch(String message){
        System.out.print(message);
        int number;
        try (Scanner stdIn = new Scanner(System.in)) {
            String input = stdIn.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error. " + e.getMessage());
                number = -1000000;
            }
        }
        return number;
    }
    
    public static float readFloat(String message){
        System.out.print(message);
        try (Scanner input = new Scanner(System.in)) {
            float number = input.nextFloat();
            return number;
        }
    }
    public static float readFloatTryCatch(String message){
        System.out.print(message);
        float number;
        try (Scanner stdIn = new Scanner(System.in)) {
            String input = stdIn.nextLine();
            try {
                number = Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Error. " + e.getMessage());
                number = (float)-0.0000001;
            }
        }
        return number;
    }
}
