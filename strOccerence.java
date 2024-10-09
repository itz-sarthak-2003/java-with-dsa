public class strOccerence {
    public static int first=-1;
    public static int last=-1;
    public static void occerence(String str,int index,char ele){

        if (index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(index);
        if(currChar == ele){
          if(first==-1){
              first=index;
          }else{
              last=index;
          }
        }
        occerence(str,index+1,ele);
    }
    public static void main(String[] args) {
        String str="abcaaad";

        occerence(str,0,'a');
    }
}
