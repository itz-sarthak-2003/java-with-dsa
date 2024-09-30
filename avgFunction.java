import java.util.Scanner;

public class avgFunction {

    public static int avg(int num1,int num2,int num3){
        int avg1=(num1+num2+num3)/3;
        return avg1;
//        System.out.println(avg1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int op=avg(num1,num2,num3);
        System.out.println(op);
    }
}
