package ARRAYS;

public class passingarrtomethods {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        change(arr);
        System.out.print(arr[0]);
    }
    public static void change(int[]a){
        a[0]=10;
    }
}
