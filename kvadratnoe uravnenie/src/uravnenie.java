/**
 * Created by java on 1/24/2016.
 */
public class uravnenie {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0 ");

        double dd = b * b - 4 * a * c;

        double x1 = (-b + Math.sqrt(dd) / 2 * a);
        double x2 = (-b - Math.sqrt(dd) / 2 * a);

        System.out.println("x1=  " + x1);
        if (dd  != 0) {
            System.out.println("x2=  " + x2);
        }


    }
}
