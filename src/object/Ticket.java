package object;

public class Ticket {

    private int amountReg;
    private int amountVip;
    private String movieName;
    private String showTime;

    public Ticket(String name, String time, int reg, int vip){
        this.movieName = name;
        this.showTime = time;
        this.amountReg = reg;
        this.amountVip = vip;
    }

    // membuat enkapsulasi
    public void setAmountReg(int amount){
        this.amountReg = amount;
    }
    public void setAmountVip(int amount){
        this.amountVip = amount;
    }
    public void setMovieName(String name){
        this.movieName = name;
    }
    public void setShowTime(String time){
        this.showTime = time;
    }
    public int getAmountReg(){
        return this.amountReg;
    }
    public int getAmountVip(){
        return this.amountVip;
    }
    public String getMovieName(){
        return this.movieName;
    }
    public String getShowTime(){
        return this.showTime;
    }
    public void getReg(){
        this.amountReg--;
    }
    public void getVip(){
        this.amountVip--;
    }
    public String toString(){
        return String.join(",", getMovieName(),getShowTime(),Integer.toString(getAmountReg()),Integer.toString(getAmountVip()));
    }
}
