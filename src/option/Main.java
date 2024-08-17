package option;
import static option.OptionMain.*;

import controllers.Admin;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        Admin admin = new Admin();
        boolean isOn = true;

        switch (getPerson()) {
            case 1:
            while(isOn){
                admin.mainMenu();
                switch (getAdminOpt()) {
                    case 1:
                        admin.handleCreate();
                        break;
                    case 2:
                        // admin.handleUpdate();
                        break;
                    case 3:
                        admin.handleDelete();
                        break;
                    case 0:
                        isOn = false;
                    default:
                        break;
                }
            }
            break;
            
            case 2:
            System.out.println("your number : " + getUseropt());
            break;

            default:
            break;
        }
    }
}
