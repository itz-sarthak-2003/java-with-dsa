public class printFact {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int a=fact(n-1);
        int a1=n*a;
        return a1;

    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
