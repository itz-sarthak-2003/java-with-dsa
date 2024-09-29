import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int user=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(user+"X"+i+"="+user*i);
        }
    }
}
