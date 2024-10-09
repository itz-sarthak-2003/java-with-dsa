public class checkArrayIsSort {
    public static boolean checkArr(int arr[],int indx){
        if(indx==arr.length-1){
            return true;
        }
        if(arr[indx]<arr[indx+1]){
            return checkArr(arr,indx+1);
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,9,3,4};
        System.out.println(checkArr(arr,0));
    }
}
