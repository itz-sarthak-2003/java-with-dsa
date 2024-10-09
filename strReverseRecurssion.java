public class strReverseRecurssion {
    public static void strReverse(String str,int index){
        if(index==-1){
            return;
        }
        System.out.println(str.charAt(index));
        strReverse(str,index-1);
    }
    public static void main(String[] args) {
       String str="abcd";
        strReverse(str, str.length()-1);
    }
}
