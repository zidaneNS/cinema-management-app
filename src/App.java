import java.util.Scanner;

import option.OptionMain;

public class App {
    public static void main(String[] args) throws Exception {
        switch (OptionMain.getPerson()) {
            case 1:
            System.out.println("your number : " + OptionMain.getAdminOpt());
            break;
            
            case 2:
            System.out.println("your number : " + OptionMain.getUseropt());
            break;

            default:
            break;
        }

        new Scanner(System.in).close();
    }
    
    
}
