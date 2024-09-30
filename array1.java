import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("enter arr ele");
        for (int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("display u enter ele");
        for (int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
