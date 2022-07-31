import java.util.Random ;
import java.util.Scanner ;

class Games
{
    Scanner generator=new Scanner(System.in);

    boolean checker = true;

    int Random_number;
//    int num;
    int count =1;
    String name ;
    Games(int num)
    {
        Random_number=num;
        System.out.print("Enter player name : ");
        String  name=generator.nextLine();
        name=name;
        System.out.println("--------------- START ---------------");

    }
   public void get()
    {

        do{
            System.out.print("Enter the number : ");
            int a=generator.nextInt();


            if(a<Random_number)
            {
                System.out.println("Given number is less than random number \n");
            }
            else if(Random_number<a)
            {
                System.out.println("Given number is greater than random number  \n");
            }
            else {

                System.out.printf(" \n\tCongratulation %s...! \n ",name);
                System.out.printf("\tGuess the number is %d attempt.",count);
                checker = false;
            }
            count =count+1;

        }
        while(checker);
    }
}

public class Main {
    public static void main(String[] args) {

        Random check =new Random();
        int min=0,max=100;
        int numbers =min + check.nextInt(max);
        Games gh=new Games(numbers);
        gh.get();


    }
}
