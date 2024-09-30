import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int cols=sc.nextInt();
        System.out.println("enter cols");
        int rows=sc.nextInt();
        int number[][]=new int[cols][rows];
        System.out.println("enter ele of array");
        for(int i=0;i<cols;i++){
            for (int j=0;j<rows;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("u enetred ele");
        for(int i=0;i<cols;i++){
            for (int j=0;j<rows;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
