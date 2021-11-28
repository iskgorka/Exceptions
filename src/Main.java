import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static double divineDouble(double x, double y) {
        return x / y;
    }
    static void checkNumber(int x){
        if(x >= 1 && x <= 100){
            System.out.println("X = "+x);
        }
        else{
            throw new InputMismatchException("Wrong!");
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(divineDouble(sc.nextDouble(), sc.nextDouble()));
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }
        checkNumber(20);
    }
}
