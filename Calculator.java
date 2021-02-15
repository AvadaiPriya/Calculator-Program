import java.util.Scanner;

public class Calculator{

     public static void main(String []args){
         int a, b, c, n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		
	    System.out.println("1.Addition:");
	    System.out.println("2.Subtraction:");
	    System.out.println("3.Multiplication:");
	    System.out.println("4.ivision:");
	    System.out.println("Default");
	    
	    System.out.println("Enter Operation Number U want");
	    n = sc.nextInt();
	    
	    switch(n) {
	        case 1 :
	            c = a + b;
	             System.out.println(c);
	            break;
	       
	       case 2 : 
	           c = a - b;
	            System.out.println(c);
	           break;
	    
	       case 3 : 
	           c = a * b;
	            System.out.println(c);
	           break;
	       
	       case 4 :
	           c = a / b;
	            System.out.println(c);
	           break;
	       
	       default : 
	            System.out.println("Invalid");
	            break;
	    }
	    
     }
}
