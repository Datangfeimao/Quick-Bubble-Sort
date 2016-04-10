/**
 * Created by junzi on 2016/4/6.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] m = {5, 1, 54, 34, 73, 6, 3, 24, 33};
        System.out.println("排序前结果为：");
        for (int a : m)
            System.out.print(a+" ");
        System.out.println();

        sort(m, 0, 8);
        System.out.println("排序后结果为：");
        for (int a : m)
        System.out.print(a+" ");

    }

    static void sort(int[] r, int low, int high) {
        //System.out.println("a");
        if (low<high) {
			int k = partition(r, low, high);           
            sort(r, low, k-1);
            sort(r, k + 1, high);
        }
        //System.out.println("a");

    }

    static int partition(int[] r, int low, int high) {
        int k = r[low];
        while (low < high) {
            while (low < high && r[high] >= k)
                high--;
            r[low]=r[high];
            while (low < high && r[low] <= k)
                low++;
            r[high]=r[low];

        }
        r[low]=k;
        return low;
    }
}

