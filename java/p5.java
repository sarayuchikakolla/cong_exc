import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int j=0;
        while(j<10){    
            System.out.println(a+"*"+j+"="+a*j);    
            j++;    
        }
    }
}
