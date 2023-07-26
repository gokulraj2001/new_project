import java.io.*;
import java.util.*;
 
class Calculate {
 public static void main(String[] args)
{
int b[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
String c="abcdefghijklmnopqrstuvwxyz"; 

Scanner s = new Scanner (System.in);
System.out.println("Enter a word :");
String a=s.nextLine();
 
int sum=0;         
System.out.println("Individual characters from given string: ");

for (int i = 1; i < a.length(); i=i+2) {
  System.out.print(a.charAt(i) + " ");
for (int j=0; j<26; j++){
char s2= a.charAt(i);
char s1= c.charAt(j);
if (s2==s1)
sum = sum+b[j];       
}
}
System.out.println(sum);
}
}