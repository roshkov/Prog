import java.util.Scanner;

/**
 * Created by java on 2/7/2016.
 */
public class summator {
   // String a1;
   // String b1;

    public static void main(String[] args) {
        summator h;
        String a1 = args[0];
        String b1 = args[1];
        h = new summator (a1,b1);
    }


    public int sum(int a, int b) {
        System.out.println("int");
        return (a + b);
    }

    public double sum(double a, double b) {
        System.out.println("doble");
        return (a + b);
    }

    public double sum(double a, int b) {
        System.out.println("d+int");
        return (a + b);
    }

    public double sum(int a, double b) {
        System.out.println("int+d");
        return (a + b);
    }


    public String sum(String a, String b) {
        System.out.println("str");
        int[] mass = new int[a.length()];
        int[] mass1 = new int[b.length()];
        int k;

        for (int i = 0; i < (mass.length ); ++i) {
            mass[i] = Integer.valueOf("" + a.charAt(i));
            mass1[i] = Integer.valueOf("" + b.charAt(i));

        }

        for (int j = mass.length; j > 0; j--) {
            k = (mass[j] + mass1[j]) / 10; //perenos
            mass[j - 1] = mass[j - 1] + k;    //esli bolshe 10   //j=1 [j-1]=0 net takogo

            mass[j] = (mass[j] + mass1[j]) % 10;

        }
        a="";

        for (int i = 0; i < (mass.length); ++i) {
            a = a + mass[i];
        }
        return (a);
    }


    public summator(String a1, String b1) {
        System.out.println("begin");
        System.out.println(sum(a1, b1));

    }
}






