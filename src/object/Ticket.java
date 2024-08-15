package object;

import controllers.Connect;

public class Ticket {

    public static void main(String[] args) {
        RTicket test = new RTicket("test","12.00 WIB");
        test.setAmount(10);
        Connect connect = new Connect();

        connect.addToDB("rtickets.txt", test.toString());
    }

    private int amount;
    private String movieName;
    private String showTime;

    public Ticket(String name, String time){
        this.movieName = name;
        this.showTime = time;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setMovieName(String name){
        this.movieName = name;
    }
    public void setShowTime(String time){
        this.showTime = time;
    }
    public int getAmount(){
        return this.amount;
    }
    public String getMovieName(){
        return this.movieName;
    }
    public String getShowTime(){
        return this.showTime;
    }
    public void getTicket(){
        this.amount--;
    }
    public String toString(){
        return String.join(",", getMovieName(),getShowTime());
    }
}
