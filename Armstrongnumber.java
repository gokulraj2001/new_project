import java.util.*;
class Armstrongnumber {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int b=s.nextInt();
        
int number, remainder, result = 0;
number=b;


while (number != 0)
{
remainder = number % 10;
result += Math.pow(remainder, 3);
number /= 10;
}

if(result == b)
System.out.println(b + " is an Armstrong number.");
else
System.out.println(b + " is not an Armstrong number.");
}
}