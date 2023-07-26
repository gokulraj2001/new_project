import java.util.*;
class Oddoreven
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int a=s.nextInt();

if (a%2==0)
{
System.out.println("The number "+a +" is even");
}
else
{
System.out.println("The number "+a +" is odd");
}
}
}