import java.util.Random;
import java.util.Scanner;

/**
 * Created by java on 2/28/2016.
 */
public class stones {
    public static void main(String[] args) {

        int player = 3;
        int comp = 3;

        int all = 0;  //chto zagadali
        int pd; //player daet;
        int cd;
        int pp;  //player point dal
        int cp;  //comp point
        boolean turn = true; //true=player ;false=comp

        Scanner s = new Scanner(System.in);


        while ((player > 0) && (comp > 0)) {
           all=0;
            System.out.print("Skolko daesh?   ");                    //daet player
            pd = s.nextInt();

            while (pd > player) {
                System.out.print("plohoe chislo, davaj eshe raz  ");
                pd = s.nextInt();
            }
            all = all + pd;


            Random rn = new Random();                       //daet comp
            cd = (rn.nextInt(3) + 1);
            all = all + cd;
            System.out.print("               //comp daet= "+cd);


            if (turn) {
                System.out.print("Kakova summa? ");                  //dumaet player-comp
                pp = s.nextInt();

                while (pp > player+comp) {
                    System.out.print("plohoe chislo, davaj eshe raz  ");
                    pp = s.nextInt();
                }

                cp = rn.nextInt(player+comp) + 1;
                while (cp == pp) {
                    cp = rn.nextInt(player+comp) + 1;
                    System.out.print("       //comp dumaet" + cp);
                }
            } else {                                            ///////////////////////////////
                cp = rn.nextInt(player+comp) + 1;
                System.out.print("       //comp dumaet" + cp);
                System.out.print("Kakova summa?  ");                  //dumaet comp-player
                pp = s.nextInt();

                while ((pp == cp) || (pp > player+comp)) {
                    System.out.print("plohoe chislo, davaj eshe raz  ");
                    pp = s.nextInt();

                }
            }


            if (cp == all) {
                comp = comp - 1;
                System.out.println("Comp ugadal summu       ");
                turn = false;
            }                                       //esli ugadal to otkladivaet kamenj
            if (pp == all) {                               //&&(pp!=cp)
                player = player - 1;
                System.out.println("Player ugadal summu");
                turn = true;
            }
            if ((pp != all) && (cp != all)) {
                System.out.println("nikto ne ugadal summu");
            }


        }

        if (player == 0) {
            System.out.println("Player wins");
        }
        if (comp == 0) {
            System.out.println("Zhelezjaka wins");
        }

    }
}