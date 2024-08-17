package option;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionMain {
    static Scanner scanner = new Scanner(System.in);

    static public int getPerson(){
        
        System.out.println("1.\tAdmin\n2.\tUser");
        System.out.print("Who are you loggin as : ");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input number u fool");
            return -1;
        }
    }
    
    static public int getAdminOpt(){
        System.out.println("================");
        System.out.println("Select number : ");
        System.out.println("================");
        System.out.println("1.\tAdd Movie\n2.\tUpdate Movie\n3.\tDelete Movie\n0.\tClose Program");
        System.out.println("What will u modify?");
        
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input number u fool");
            return -1;
        }
    }
    
    static public int getUseropt(){
        System.out.println("This will be the list of movies");
        System.out.println("Choose movie you'll watch : ");
        
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input number u fool");
            return -1;
        }
    }
}
