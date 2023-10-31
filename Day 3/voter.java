import java.util.*;
public class voter {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age  = sc.nextInt();
        System.out.println("Enter minimun age for voting  ");
        int vote_age = sc.nextInt();
        System.out.println("Enter minimun age for marriage ");
        int marriage_age = sc.nextInt();
        if(age>=vote_age && age>=marriage_age)
        {
           System.out.println("Eligible to Vote and Marriage");
        }
        elseif(age>=vote_age && age<marriage_age)
        {
           System.out.println("Not Eligible to vote");
        }

    }
}
