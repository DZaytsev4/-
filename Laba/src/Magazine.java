import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Magazine {
    String name;
    ArrayList<Clocks> list = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Magazine(){
        System.out.println("Введите название магазина:");
        name = in.nextLine();
    }
    void AddClock(Clocks cl){
        list.add(cl);
        Collections.sort(list, (a, b)->{
            if (a.getPrice() > b.getPrice()) return 1;
            if (a.getPrice() < b.getPrice()) return -1;
            return 0;
        });
    }
    Clocks printExpensive(){
        return list.get(list.size()-1);
    }
    void setTime(Time A){
        for (Clocks element: list){
            element.setTime(A);
        }
    }
    String printFrequentMark(){
        String mostFrequentMark = list.get(0).getMark();
        int maxCount = 1;
        for (int i = 0; i < list.size(); i++) {
            String currentMark = list.get(i).getMark();
            int currentCount = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (currentMark.equals(list.get(j).getMark())) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequentMark = currentMark;
            }
        }
        return mostFrequentMark;
    }
    void PrintAll(){

    }
}
