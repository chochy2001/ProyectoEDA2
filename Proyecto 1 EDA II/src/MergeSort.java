public class MergeSort {
    static int heapSize;
    public static void heap(int[] arr, int size){
        buildHeap(arr,size);
        int i;
        for(i = size - 1; i > 0; i--){
            swap(arr,0, heapSize);
            heapSize--;
            System.out.println("Iteracion HS:");
            printArray(arr,size);
            heapify(arr, 0,size);
        }
    }
    public static void buildHeap(int[] arr, int size){
        heapSize = size - 1;
        int i;
        for(i = (size - 1) / 2; i >= 0; i--){
            heapify(arr, i, size);
        }
        System.out.println("Termina de construir el HEAP \n");
    }
    public static void heapify(int[] arr, int i, int size){
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        if(l <= heapSize && arr[l] > arr[i])
            largest = l;
        else
            largest = i;
        if(r <= heapSize && arr[r] > arr[largest])
            largest = r;
            if(largest != i){
                swap(arr,i, largest);
                printArray(arr,size);
                heapify(arr, largest, size);
            }
    }
    public static void swap(int[] arr, int i, int largest){
        int t = arr[i];
        arr[i] = arr[largest];
        arr[largest] = t;
    }

    public static void printArray(int[] arr,int size){
        int i;
        for (i=0; i < size; i++){
            System.out.println(" " + arr[i]);
        }
    }
}
