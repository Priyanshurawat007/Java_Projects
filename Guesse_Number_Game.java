
import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesse=0;

    public int getnumberofGusse(){
        return this.numberOfGuesse;}
    

    public void setnumberofGusse(int numberofGuesse){
        this.numberOfGuesse=numberofGuesse;
    }


Game(){
    Random ran = new Random();
    this.number =ran.nextInt(100);
}

void TakeUserInput(){
    System.out.println("Guess the Number");
    Scanner sc=new Scanner(System.in);
    inputNumber=sc.nextInt();
}
boolean isCorrectNumber(){
    numberOfGuesse++;
    if(inputNumber==number){
        System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",number,numberOfGuesse);
        return true;
    }
    else if(inputNumber<number){
        System.out.println("Too Low...");
    }
    else if(inputNumber>number){
        System.out.println("Too High...");

    }
    return false;
}

    


public class Oops_3 {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.TakeUserInput();
            b=g.isCorrectNumber();
        }
    }

    
}
}