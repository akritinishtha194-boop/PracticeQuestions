package ARRAYS;

public class linearsearch {
    public static void main(String[]args){
        int[]arr={1,4,6,8,9,7,5,3};
        int target=8;
        int found=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=i;
                break;
            }
        }
        if(found!=-1){
            System.out.println("Element exists in the array");
        }
        else{
            System.out.println("Element doesn't exists in the array");
        }
    }
}
