public class Time {
        int hours;
        int minute;
        int seconds;
        Time(){
            this.hours=12;
            this.minute=30;
            this.seconds=0;
        }
        Time(int a, int b, int c){
            if(a>24){throw new RuntimeException(" Введено неправильное значение часов, введите меньше 24");}
            if(b>60){throw new RuntimeException(" Введено неправильное значение минут, введите меньше 60");}
            if(c>60){throw new RuntimeException(" Введено неправильное значение секунд, введите меньше 60");}
            this.hours=a;
            this.minute=b;
            this.seconds=c;
        }
        void setTime(int a, int b, int c)
        {
            if(a>24){throw new RuntimeException(" Введено неправильное значение часов, введите меньше 24");}
            if(b>60){throw new RuntimeException(" Введено неправильное значение минут, введите меньше 60");}
            if(c>60){throw new RuntimeException(" Введено неправильное значение секунд, введите меньше 60");}
            this.hours=a;
            this.minute=b;
            this.seconds=c;
        }

}
