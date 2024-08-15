package object;

public class VIPTicket extends Ticket {
    double priceSeat = 40;

    public VIPTicket(String name, String time) {
        super(name, time);
    }

    public String toString(){
        return String.join(",",Integer.toString(getAmount()));
    }
}
