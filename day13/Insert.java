public class Insert extends PrintArray {
    public static void main(String[] args) {
        int[] arr = {3, 44, 545, 6, 32, 15, 345, 56};
        int startIndex=findIndex(arr);
    }

    private static int findIndex(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]> arr[i+1]){
                return i+1;
            }
        }
        return arr.length-1;
    }
}
