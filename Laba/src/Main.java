import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Scanner in = new Scanner(System.in);
        boolean work = true;
        while (work == true){
            System.out.println("Какое действие вы хотите совершить?");
            System.out.println("1 - Добавить часы");
            System.out.println("2 - Установить на часах начальное время");
            System.out.println("3 - Вывести самые дорогие часы");
            System.out.println("4 - Вывести все часы");
            System.out.println("5 - Вывести наиболее часто встречающую марку");
            System.out.println("6 - Прекратить работу");
            int act = in.nextInt();
            switch (act){
                case 1:
                    System.out.println("Какой тип часов вы хотите добавить(1 - без сек. стрелки 2 - с сек. стрелкой)");
                    ClocksFactory clockfactory = new ClocksFactory(in.nextInt());
                    Clocks cl = clockfactory.create();
                    System.out.println("Введите цену:");
                    cl.setPrice(in.nextInt());
                    System.out.println("Введите марку:");
                    cl.setMark(in.next());
                    magazine.AddClock(cl);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    work = false;
            }
        }
    }
}