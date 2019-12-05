public class BinaryRecursiveSearch implements Practice03Search {


    public String searchName(){
        return "Binary Recursive";
    }



    private static int binary(int numArr[],int dest,int s,int l){
        if (s > l) {
            return -1;
        }

        int m = (s + l) / 2;

        if (numArr[m] != dest) {
            if (numArr[m] < dest) {
                return binary(numArr, dest, m + 1, l);
            } else {
                // last possibility: a[mid] > x
                return binary(numArr, dest, s, m - 1);
            }
        } else {
            return m;
        }

    }
    public int search(int [] arrNums, int dest ){
        return binary(arrNums,dest,0,arrNums.length-1);
    }
}
