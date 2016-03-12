/**
 * Created by java on 1/24/2016.
 */
public class fibon {
    public static void main(String[] args) {

        int one = 1;
        int two = 1;
        System.out.println(one);
        System.out.println(two);

        for (int i = 1; i < 15; ++i) {
            if (i % 2 == 0) {
                two = one + two;
                System.out.println(two);
            } else {
                one = one + two;
                System.out.println(one);
            }
        }
    }
}
