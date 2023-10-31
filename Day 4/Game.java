import java.util.*;
class Game
{
    public static void main(String ar[])
    {
        int Sec=125;
        int choice=0;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        while(Sec!=choice)
        {
          count++;
          if(choice > Sec)
          {
             System.out.println("Choice does not match ,It is Higher, enter again");
             choice  = sc.nextInt();
          }
          else
          {
             System.out.println("Choice does not match , It is Lower, enter again");
             choice  = sc.nextInt();
          }
          
        }

         System.out.println("Choice Matched congrats");
         System.out.println("You Took" + count + " turns");
         sc.close();


    }
}