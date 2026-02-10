import java.util.Scanner;
public class palindrome{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String str="level";
        String rev="";
        int vowelcount=0;
        for(int i=str.length()-1;i>=0;i--){
            rev= rev+str.charAt(i);
            
        }
        if(str.equals(rev)){
            System.out.println("the string is a palindrome");


        }else{
            System.out.println("the string is not a palindrome");
        }
        if(str.contains("a,e,i,o,u")){
            vowelcount++;

        }
        System.out.println(vowelcount);
    }

}