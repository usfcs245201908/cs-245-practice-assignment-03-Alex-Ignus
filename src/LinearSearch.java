public class LinearSearch implements Practice03Search {

    public String searchName(){
        return "Linear Search ";
    }

    public int search(int [] arr, int target){
        int s = arr.length;
        int t = 0;
        for(int i = s - 1; i >= 0; i--){
            if (arr[i] != target) {
                continue;
            }
            t = i;
        }
        return t;
    }
}
