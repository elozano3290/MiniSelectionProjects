import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weather(hot,rainy,cold): ");
        String weather = scan.nextLine().toLowerCase();

        System.out.println("you should wear: ");
        if(weather.equals("hot")){
            System.out.println("wear a t-shirt and shorts. ");

        } else if(weather.equals("rainy")){
            System.out.println("wear a rain coat and rain boots");
        } else if (weather.equals("cold")){
            System.out.println("wear a puffer jacket, its cold ");
        }else{
            System.out.println("go outside and check the weather ");
        }









    }
}