package object;

public class RTicket extends Ticket {
    double priceSeat = 20;

    public RTicket(String name, String time) {
        super(name, time);
    }

    public String toString(){
        return String.join(",",Integer.toString(getAmount()));
    }
    
}
