public class clearBit {
    public static void main(String[] args) {
        int n=5,pos=2;
        int bitMask=1<<pos;
        int a=~(bitMask);
        int b=a & n;
        System.out.println(b);
    }
}
