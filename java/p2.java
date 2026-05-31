import java.util.*;
public class p2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("choose operation \n 1.addition \n 2.subtraction \n 3. multiplication \n 4.division");
        int choice=sc.nextInt();
            switch(choice){
                case 1: System.out.println("a+b="+(a+b));
                break;
                case 2: System.out.println("a-b="+ (a-b));
                break;      
                case 3: System.out.println("a*b="+a*b);
                break;
                case 4: System.out.println("a/b="+a/b);
                break;
                default: System.out.println("invalid choice");
            
            }
        

    }
}
