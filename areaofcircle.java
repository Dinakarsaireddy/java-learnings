import java.util.Scanner;
public class areaofcircle{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the raidus of circle:");
        double radius=sc.nextDouble();
        double area=Math.PI * radius*radius;
        System.out.println("the area of the circle is:"+ area);
    }
}