import java.util.Scanner;

/**
 * Created by java on 1/31/2016.
 */
public class sort {
    public static void main(String[] args) {
        int[] mass = new int[5];
        int d;
        int i;
        int n = 0;


        Scanner s = new Scanner(System.in);
        for (i = 0; i < mass.length; ++i) {
            mass[i] = s.nextInt();
        }
        s.close();

         do {
            n = 0;
            for (i = 0; i < mass.length-1; ++i) {


                if (mass[i] > mass[i + 1]) {
                    d = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = d;
                    n = n + 1;
                }

            }
        }
         while (n>0);

        for (i = 0; i < mass.length; ++i) {
            System.out.println(mass[i]);
        }

    }
}
