import java.util.*;
public class evendigit {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num  = sc.nextInt() , rem;
        int count=0;
        while(num>0)
        {
          rem  = num%10;
          if(rem%2==0)
          {
            count++;
          }  
          num = num/10;
    }
    System.out.println("Total Even Numbers are " + count);
    sc.close();
    }

    
}
