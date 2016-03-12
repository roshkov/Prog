/**
 * Created by java on 1/24/2016.
 */
public class Min {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int m;
        if (a < b) {
            if (a < c) {
                m = a;
            } else {
                m = c;
            }
        } else {
            if (b < c) {
                m = b;
            } else {
                m = c;
            }
        }
        System.out.println(m);

    }
}
