//wajp to reverse a number.

import java.io.*;
class reverse
{
public static void main(String args[])
{
Console c=System.console();
int num=Integer.parseInt(c.readLine("enter the number :"));

int rev=0;
while(num!=0){
rev=rev*10+num%10;
num=num/10;
}
System.out.println("Reverse no =" +rev);

}
}