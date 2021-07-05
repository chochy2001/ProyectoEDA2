import java.util.ArrayList;

/**
 * Clase correspondiente al algoritmo de Ordenamiento HeapSort
 * consiste en remover el mayor elemento que es siempre la raiz del Heap.
 *
 * Una vez seleccionado el máximo,lo intercambiamos con el último elemento del vector,
 * decrementamos la cantidad de elementos del Heap y nos encargamos de reacomodarlo para que vuelva a ser un Heap.
 *
 * @author Luis Aldo Gomez Bolaños, Karen Mariel Bastida Vargas y Jorge Salgado Miranda
 * @version 1.0
 */
public class HeapSort {

    static int heapSize;

    /** Crea un heap a partir de un arreglo de enteros y su tamaño
     *
     *
     * @param arr1 El arreglo de enteros
     * @param size El tamaño del arreglo
     */
    public static void heap(ArrayList<Integer> arr1, int size){ //
        buildHeap(arr1,size);
        int i;
        for(i = size - 1; i > 0; i--){
            swap(arr1,0, heapSize);
            heapSize--;
            System.out.println("Iteracion HS:");
            printArray(arr1);
            heapify(arr1, 0,size);
        }
    }

    /**
     * Construye un Heap a partir de un arreglo de enteros y su tamaño
     *
     * @param arr1 ArrayList de Enteros
     * @param size Tamaño del arreglo
     */

    public static void buildHeap(ArrayList<Integer> arr1, int size){
        heapSize = size - 1;
        int i;
        for(i = (size - 1) / 2; i >= 0; i--){
            heapify(arr1, i, size);
        }
        System.out.println("Termina de construir el HEAP \n");
    }


    /**
     * Método que consiste en reconstruir el Heap una vez eliminada la raiz del Heap
     *
     * @param arr1 Arreglo de enteros
     * @param i Tamaño minimo del arreglo
     * @param  size Tamaño del arreglo
     */
    public static void heapify(ArrayList<Integer> arr1, int i, int size){
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        if(l <= heapSize && arr1.get(i) > arr1.get(i))
            largest = l;
        else
            largest = i;
        if(r <= heapSize && arr1.get(r) > arr1.get(largest))
            largest = r;
            if(largest != i){
                swap(arr1,i, largest);
                printArray(arr1);
                heapify(arr1, largest, size);
            }
    }
    public static void swap(ArrayList<Integer> arr1, int i, int largest){
        int t = arr1.get(i);
        arr1.set(i, arr1.get(largest));
        arr1.set(largest, t);
    }

    /**
     * Método que nos sirve para poder imprimir el arreglo
     * @param arr1 Arreglo de Enteros
     */

    public static void printArray(ArrayList<Integer> arr1){
        System.out.println("Imprimiendo Datos del arreglo: ");
        for(int print : arr1){
            System.out.println(print);
        }
    }
}
