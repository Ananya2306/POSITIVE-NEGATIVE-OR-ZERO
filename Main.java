import java.util.*;

public class Main 
{    
public static void main(String[] args)
 {    
	 Scanner sc = new Scanner(System.in);

	 System.out.print("Enter a Number to check whether its Positive , Negative or Zero = ");
	 int number = sc.nextInt();
        
    if(number>0){  

    System.out.println("This number is POSITIVE !!!");  
    }
		else if(number<0)
		{  
    System.out.println("This number is NEGATIVE !!!");  
    }
		else
		{  
    System.out.println("This number is ZERO !!!");  
   }  
}    
}    