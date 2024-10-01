public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Sarthak");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        for (int i=str.length();i>=0;i--){
            System.out.println(str);
        }
    }
}
