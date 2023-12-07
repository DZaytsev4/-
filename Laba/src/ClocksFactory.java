public class ClocksFactory {
    int a;
    ClocksFactory(int _a){
        a = _a;
    }
    Clocks create(){
        if (a == 1){
            return new Clock();
        }
        if (a == 2) {
            return new ClockSecund();
        }
        else {
            throw new RuntimeException(a +" is unknow");
        }
    }
}
