public class largestinaArray {
    public static void main(String[] args) {
        int arr[] = new int []{ 85,25,33,44,55,};
        int max= arr[0];
       for (int i = 1; i<arr.length;i ++){
        if (arr[i]>max){
            max = arr[i];
        }
       }
        System.out.println("largest number of array is :" + max);
    }
}
