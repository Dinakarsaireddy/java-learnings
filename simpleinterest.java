import java.util.Scanner;
public class simpleinterest{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principle amount:");
        double principle=sc.nextDouble();
        System.out.println("enter the time:");
        double time=sc.nextDouble();
        System.out.println("enter the rate:");
        double rate=sc.nextDouble();
        double si=(principle*time*rate)/100;
        System.out.println("the simple interest is:"+si);
    }
}