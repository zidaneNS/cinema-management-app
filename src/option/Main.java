package option;
import static option.OptionMain.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        switch (getPerson()) {
            case 1:
            System.out.println("your number : " + getAdminOpt());
            break;
            
            case 2:
            System.out.println("your number : " + getUseropt());
            break;

            default:
            break;
        }
    }
}
