import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {
    private int value;

    MyException(int x) {
        value = x;
    }

    public String toString() {
        if (value < 1) {
            return "MyException [" + value + "] is less than 0.";
        } else return "MyException [" + value + "] is more than 100.";
    }
}

public class Main {
    static double divineDouble(double x, double y) {
        return x / y;
    }

    static void checkNumber(int x) throws MyException {
        if (x >= 1 && x <= 100) {
            System.out.println("X = " + x);
        } else if (x < 1) {
            throw new MyException(x);
        } else if (x > 100) {
            throw new MyException(x);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input 2 numbers: ");
            System.out.println(divineDouble(sc.nextDouble(), sc.nextDouble()));
        } catch (InputMismatchException e) {
            System.out.println("You input a string value.");
        }
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number from 1 to 100: ");
            checkNumber(sc.nextInt());
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
