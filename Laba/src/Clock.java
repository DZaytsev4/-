
public class Clock implements  Clocks, Comparable<Clock> {
    int hours, minute, price;
    String mark;
    Clock(){
        hours = 12;
        minute = 30;
        price = 20000;
        mark = "Casio";
    }
    Clock(Time a, int b, String c){
        hours = a.hours;
        minute = a.minute;
        price = b;
        mark = c;
    }
    public int getPrice(){
        return this.price;
    }
    public String getMark(){
        return this.mark;
    }
    public void setTime(Time a){
        this.hours = a.hours;
        this.minute = a.minute;
    }
    public void setPrice(int a){
        this.price = a;
    }
    public void setMark(String a){
        this.mark = a;
    }
    public void printInfo(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Marc: "+ this.mark+ ", Price: "+ this.price+ ", Time: "+ this.hours+ ":"+ this.minute);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void Per(Time a){
        this.hours += a.hours;
        this.minute += a.minute;
        if (this.minute > 60){
            this.minute -= 60;
            this.hours +=1;
        }
        if (this.hours > 24){
            this.hours -=24;
        }
    }
    public int compareTo(Clock otherClock){
        return Integer.compare(this.price, otherClock.price);
    }
}
