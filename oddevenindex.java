package ARRAYS;

public class oddevenindex {
    public static void main(String[]args){
        int[]arr={1,4,5,3,2,8,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(10*arr[i]);
            }
            else{
                System.out.println(2*arr[i]);
            }
        }
    }
}
