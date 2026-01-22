import java.util.Scanner;
public class swapnumbers{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a= sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        
        System.out.println("before swapping");
        System.out.println("the value of a is:"+a);
        System.out.println("the value of b is:"+b);
        System.out.println("after swapping");
        int c=a;
        a=b;
        b=c;
        System.out.println("the value of a is:"+a);
        System.out.println("the value of b is:"+b);



    }
}