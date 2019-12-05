public class BinaryIterativeSearch implements Practice03Search {

    public String searchName(){
        return "Binary Iterative";
    }

    public int search(int [] arr, int target){
        int s = 0;
        int l = arr.length - 1;

        while (s <= l) {

            int m = (s + l) / 2;

            if (target < arr[m]) {
                l = m - 1;
            }

            if (target > arr[m]) {
                s = m + 1;
            }

            if (target == arr[m]) {
                return m;
            }
        }
        return -1;

    }
}
