package option;

import java.util.Scanner;

public class OptionMain {
    static public int getPerson(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1.\tAdmin\n2.\tUser");
        System.out.print("Who are you loggin as : ");

        return scanner.nextInt();
    }
    
    static public int getAdminOpt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tAdd Movie\n2.\tDelete Movie");
        System.out.println("What will u modify?");
        
        return scanner.nextInt();
    }
    
    static public int getUseropt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This will be the list of movies");
        System.out.println("Choose movie you'll watch : ");
        
        return scanner.nextInt();
    }
}
