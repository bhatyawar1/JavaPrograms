package BasicPrograms;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.LinkedList;

public class Practice {
     static int heapSize =0;
    public static void main(String[] args) {
        int []arr = {10,30,50,20,35,15};
        for (int i = arr.length/2; i >=0 ; i--) {
            heapify(arr,i,arr.length-1);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0 ; i--) {
            delete(arr,0,i);
            heapify(arr,0,i-1);
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void heapify(int []arr,int i,int n){
        for (int j = i; j <n; j++) {
            int largest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if (l <= n && arr[l] > arr[largest]) {
                largest = l;
            }
            if (r <= n && arr[r] > arr[largest]) {
                largest = r;
            }
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;

            }
        }

    }

    public static void delete(int []arr,int start,int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }


}

