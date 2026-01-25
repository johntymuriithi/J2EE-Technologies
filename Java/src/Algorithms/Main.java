package Algorithms;

// let do binary search

class Binary {

    static int searchBinary(int[] list, int target) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int item = list[middle];

            if (item == target) return middle;
            else if (item > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }

}

public class Main {
    static int[] myList = {3, 4, 5, 6};

    public static void main(String[] args) {
        System.out.println(Binary.searchBinary(myList, 6));
    }
}
