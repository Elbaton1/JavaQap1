public class TestTime {
    public static void main(String[] args) {
        
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        
        t1.nextSecond();
        t2.previousSecond();

        
        System.out.println("Time after nextSecond on t1: " + t1);
        System.out.println("Time after previousSecond on t2: " + t2);
    }
}
