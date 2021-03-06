package tree;

/**
 * Created by Haiyoung on 2017/12/14.
 */
public class BinaryTree {

    //快速排序
    public static void quickSort(int[] intArr, int low, int high){
        if(intArr.length <= 1){
            return;
        }
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int pivot = intArr[i];
        while(i < j){
            while(i < j && intArr[j] >= pivot){
                j--;
            }
            if(i < j){
                intArr[i] = intArr[j];
            }
            while (i < j && intArr[i] <= pivot){
                i++;
            }
            if(i < j){
                intArr[j] = intArr[i];
            }
        }
        intArr[i] = pivot;
        quickSort(intArr, low, i - 1);
        quickSort(intArr, i+1, high);
    }
}
