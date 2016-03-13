/**
 * Created by java on 3/6/2016.
 */
public class iosiff {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]) - 1;  //kazhdij tretij == +2

        int j;
        int i;
        int q = 0;   //q=[0..4]
        int l = 0; //last
        int lc=0;//last kolvo;

        int[] mass = new int[n];
        for (i = 0; i <= n - 1; i++) {
            mass[i] = 1;
        }
        System.out.print("hello");

        while (lc !=1) {

            lc = 0;
            /////
            for (i = 1; i <= m; i++) {            //perehod na m shagov

                while (mass[q] == 0) {
                    q = q + 1;
                    if (q > n - 1) {
                        q = q - n;
                    }
                }
                q = q + 1;
                if (q > n - 1) {
                    q = q - n;
                }

                while (mass[q] == 0) {
                    q = q + 1;
                    if (q > n - 1) {
                        q = q - n;
                    }
                }

            }

            mass[q] = 0;
            q = q + 1;
            
            if (q > n - 1) {
                        q = q - n;
                    }


            ////

            for (i = 0; i <= n - 1; i++) {
                if (mass[i] == 1) {
                    lc = lc + 1; //kolvo
                    l=i; //poslednij nomer gde stoit "1"
                }
            }

        }
        if (m+1==0) {
            System.out.println("Everyone has survived");
        } else {
            System.out.println("Lucky #" + (l + 1) + " has survived");

        }

    }
}

