package java_Git_Lab3_6;

public class MyCalculator implements PrimitiveCalculator{
    public MyCalculator(double a, String o, double b) {
        if (o.equals("+")) {
            System.out.println(a + " + " + b + " = " + add(a,b));
            return;
        }
        if (o.equals("-")) {
            System.out.println(a + " + " + b + " = " + sub(a,b));
            return;
        }
        if (o.equals("*")) {
            System.out.println(a + " + " + b + " = " + mul(a,b));
            return;
        }
        if (o.equals("/")) {
            System.out.println(a + " + " + b + " = " + div(a,b));
            return;
        }
        System.out.println("Неизвестная операция");
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        if (args.length >= 3) {
            new MyCalculator(Double.valueOf(args[0]), args[1],
                    Double.valueOf(args[2]));
        } else {
            System.out.println("Введите такие параметры: 1 + 1");
            return;
        }
    }
}
