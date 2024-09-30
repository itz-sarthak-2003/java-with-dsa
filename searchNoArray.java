import java.util.Scanner;
public class searchNoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("enter ele");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("enter searh ele");
        int search=sc.nextInt();
        for (int i=0;i<size;i++){
          if(marks[i]==search){
                System.out.println(i);
                break;
            }
        }
    }
}
