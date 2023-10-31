import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a two digit number ");
        int player = scan.nextInt();
        int computer = (int) (Math.random()*90 + 10) ;
        int lottonumber = computer;
         System.out.println("The lotto number is " + lottonumber);

        if(player == computer){
            System.out.println("YOU GOT IT !!!");
            System.out.println("you win the jackpot of 10,000");
        }
        int ones = lottonumber %10;
        int tens = lottonumber /10;

        if(computer == ones) {
            System.out.println("you got the ome digits correct ");
            System.out.println("you win $500");

            if (computer == ones && computer == tens) {
                System.out.println("you got both digits correct.");
                System.out.println("you win $2,000");
            } else {
                System.out.println("you did not win anything");
            }


        }

    }
}
