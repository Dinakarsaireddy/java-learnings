import java.util.Scanner;
public class addtwonumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int result=a+b;
        System.out.println("the addition of two numbers is:"+ result);
    }
}