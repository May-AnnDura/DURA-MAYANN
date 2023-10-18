import java.util.Scanner;

class Pemdas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("PEMDAS format example: (a + b + c) * d - e / f");
        System.out.print("No operators. Enter any six numbers: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        double result = (a + b + c) * d - e / f;
        scan.close();
        System.out.println("Value of result is " + result);

    }
}
