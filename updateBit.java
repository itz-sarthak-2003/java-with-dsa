public class updateBit {
    public static void main(String[] args) {
        int n=5,pos=1;
        int bitMask=1<<pos;
        int user=1;
        if(user==1){
            int one=bitMask | n;
            System.out.println(one);
        }if(user==0){
            int two=~bitMask;
            int one=bitMask & n;
            System.out.println(one);
        }
    }
}
