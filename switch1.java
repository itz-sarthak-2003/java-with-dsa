import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no betn 1-3");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Marathi");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Gujrati");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
