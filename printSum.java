public class printSum {
    public static void sumPrint(int i,int n,int sum){
        if (i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        i=i+1;
       sumPrint(i,n,sum);
    }
    public static void main(String[] args) {
        sumPrint(1,5,0);
    }
}
