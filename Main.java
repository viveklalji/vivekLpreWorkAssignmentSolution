import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	     //function to checkPalindrome

public void checkPalindrome()  {
	   int r,n,sum=0,temp;  
	   System.out.println("enter the number to check palindrome");
	   
	   n=sc.nextInt();
        temp=n; 
        
        while(n>0){    
         r=n%10;    
         sum=(sum*10)+r;    
         n=n/10;    
         }    
			
         if(temp==sum)    
          System.out.println("palindrome number ");    
         else    
          System.out.println("not palindrome");

     }

     //function to printPattern

public void printPattern() {
	
	System.out.println("input the number of rows");
	int n=sc.nextInt();
	for(int i=n;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*"+ " ");
		}
		System.out.println();
		
	}
	
}



   //function to check no is prime or not

 public void checkPrimeNumber() {
	
		System.out.println("input the number to check prime number");
		int n=sc.nextInt();
		int temp;
		boolean check=true;
		if(n==0||n==1) {
			check=false;	
		}
		else {
			for(int i=2;i<=n/2;i++)
			{
		           temp=n%i;
			   if(temp==0)
			   {
			      check=false;
			      break;
			   }
			}
		}
		if(check)
			   System.out.println(n + " is a Prime Number");
			else
			   System.out.println(n + " is not a Prime Number");

 }

  

   // function to print Fibonacci Series

   public void printFibonacciSeries() {
       
    
    int n, a=0, b= 0, c=1;
    
    System.out.print("Enter value of n:");
    n = sc.nextInt();
    System.out.print("Fibonacci Series:");
    for(int i = 1; i <= n; i++)
    {
        a = b;
        b = c;
        c = a + b;
        System.out.print(a+" ");
    }

   }



//main method which contains switch and do while loop

public static void main(String[] args) {

         Main obj = new Main();

         int choice;

         Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();



choice = sc.nextInt();

switch (choice) {



case 0:

choice = 0;

break;



case 1: {

obj.checkPalindrome();


}

break;



case 2: {



obj.printPattern();

}

break;



case 3: {

obj.checkPrimeNumber();

}

break;



case 4: {



obj.printFibonacciSeries();

}

break;



default:

System.out.println("Invalid choice. Enter a valid no.\n");

}



} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}
}
