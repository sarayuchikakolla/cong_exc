import java.util.*;
public class p9 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        if(a<=100 && a>=90){
            System.out.println("grade A");
            }else if(a<=89 && a>=80)
                {
                System.out.println("grade B");
                }else if(a<=79 && a>=70)
                    {
                    System.out.println("grade C");
                    }else if(a<=69 && a>=60)
                        {
                        System.out.println("grade D");
                        }else{
                                System.out.println("grade F");
                            }

    }
}

