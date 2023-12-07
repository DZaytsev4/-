public class ClockSecund extends Clock {
    int seconds;
    ClockSecund(){
        super();
        seconds = 0;
    }
    ClockSecund(Time a, int b, String c ){
        super(a,b,c);
        seconds = a.seconds;
    }
    @Override
    public void setTime(Time a) {
        super.setTime(a);
        this.seconds = a.seconds;
    }

    @Override
    public void Per(Time a) {
        this.hours += a.hours;
        this.minute += a.minute;
        this.seconds += a.seconds;
        if (this.seconds > 60){
            this.seconds -=60;
            this.minute +=1;
        }
        if (this.minute > 60){
            this.minute -= 60;
            this.hours +=1;
        }
        if (this.hours > 24){
            this.hours -=24;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Marc: "+ this.mark+ ", Price: "+ this.price+ ", Time: "+ this.hours+ ":"+ this.minute+":"+this.seconds);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public int compareTo(ClockSecund otherClock){
        return Integer.compare(this.price, otherClock.price);
    }
}
