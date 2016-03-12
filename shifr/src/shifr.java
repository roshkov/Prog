/**
 * Created by java on 2/21/2016.
 */
public class shifr {

    public static void main(String[] args) {

        char[] mass = new char[26];               //massiv alphavite
        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            mass[index] = c;
            index = index + 1;
        }


        String a1 = args[0];
        String b1="";

        char d;

        int j = 0;
        int c = 5; //perehod


        for (int i = 0; i <= a1.length(); i++) {
            d = a1.charAt(i);

            while (mass[j] != d) {
                if (j < 26) {
                    j = j + 1;
                }
            }



            if (j + c > 25) {
                j = j + c - 25;
            } else {
                j = j + c;
            }

            b1 = b1 + mass[j];

        }
        System.out.println(b1);

    }

}
