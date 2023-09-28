import java.util.Random;
import java.util.Scanner;

public class RPS_Game {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Choice 0 for Rock, 1 for Paper, 2 for Sessior : ");
        int userInput=sc.nextInt();

        Random random=new Random();
        int computerInput=random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Match Draw !");}

            else if(userInput== 0 && computerInput==2 ||userInput== 1 && computerInput==2||userInput== 2 && computerInput==1 ){
                System.out.println("You Win buddy :) ");
            }
            else{
                System.out.println("Computer Win :( ");

            }

        System.out.println("Computer Choice: "+computerInput);

    

        }
    
}
