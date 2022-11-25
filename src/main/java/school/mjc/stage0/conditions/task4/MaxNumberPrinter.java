package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first>second){
            if (first>third){
                System.out.println(first);
            }
            else if (third>first){
                System.out.println(third);
            }
        }
        else {
            System.out.println(second);
        }
    }

    public static void main(String[] args) {
        MaxNumberPrinter mnp = new MaxNumberPrinter();
        mnp.printGreatest(1,9,1);
    }
}
