package IsmayilMath;

import java.util.Scanner;



public class Main {

    public static void main(String[] args)  {

        Scanner console = new Scanner(System.in);
        double firstnum;
        double secondnum;
        while (console.hasNextLine()) {

            var x = console.nextLine();
            var y = console.nextLine();



            if(isNumeric(x)){
                firstnum = Double.parseDouble(x);
                firstnum = firstnum%2==0? firstnum*2 : firstnum+2;

            }else {
                System.out.println("Please input two random numbers :-)");
                continue;
            }

            if(isNumeric(y)){
                secondnum  = Double.parseDouble(y);
                secondnum  = secondnum%2==0? secondnum*2 : secondnum+2;
            }else {
                System.out.println("Please input two random  number :-)");
                continue;
            }

            System.out.println(firstnum +secondnum);

            }

        }    // POPITKA OBNOVLENIA CODA NA NOVIY BRANCH


    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
