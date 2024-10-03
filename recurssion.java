public class recurssion {
    public static void recursvieFun(int num) {
        if(num==0){
            return;
        }
        System.out.println(num);
        recursvieFun(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        recursvieFun(num);
    }
}