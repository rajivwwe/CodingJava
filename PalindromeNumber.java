# CodingJava
import java.util.Scanner;
public class PalinDromeNumber
{
public static void main(String args[]){
System.out.println("Enter a number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a,b,i;
i=n;
while(n>0){
a=n%10;
b=b*10+a;
n=n/10;
}
}
