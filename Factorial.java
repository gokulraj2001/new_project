import java.util.*;
class Factorial
{  
public static void main(String args[])
{
Scanner s=new Scanner (System.in); 

System.out.println("Enter a number");
int b=s.nextInt();
 
int i,fact=1;  

for(i=1;i<=b;i++){    
fact=fact*i;    
}    
System.out.println("Factorial of "+b+" is: "+fact);    
}  
}  