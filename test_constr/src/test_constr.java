/**
 * Created by java on 2/7/2016.
 */
public class test_constr {
    public static double x;

    static {
        System.out.println("1");
    }

    test_constr h = new test_constr();

    public test_constr() {
        System.out.println("2");
    }
}




