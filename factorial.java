import java.util.Scanner;

public class factorial {

    public static void fact(int num){
        int fact1=1;
        for(int i=num;i>=1;i--){
            fact1=fact1*i;
        }
        System.out.println(fact1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fact(num);
    }
}
