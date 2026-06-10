package mayur;

public class MaxArrayindex {
    public static void main(String[] args) {
        int[] arr = {3, 55, 6, 8, 23};
        System.out.println(Max(arr));
    }

    static int Max(int []arr){
        int maxval=0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>maxval){
                maxval=arr[i];

            }
        }
        return maxval;
    }
}