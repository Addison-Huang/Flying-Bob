import java.util.ArrayList;
import java.util.Random;
import java.lang.reflect.Array;

public class HeapSort<E extends Comparable<E>> {

  public static void sort(E[] a, int n) {
    heapsort(a, n - 1);
  }

  public static void sort(ArrayList<E> list) {
    E[] a = (E[]) list.toArray((E[]) Array.newInstance(list.get(0).getClass(), list.size()));
    
    sort(a, list.size()); 
    
    for (int i = 0; i < a.length; i++)
      list.set(i, a[i]);
  }

  private void heapsort(E[] a, int lastLeaf) {
    buildMaxHeap(a, lastLeaf);

   
    while (lastLeaf > 0) {
      swap(a, 0, lastLeaf);       
      lastLeaf--;                 
      maxHeapify(a, 0, lastLeaf);
    }
  }

 
  private void maxHeapify(E[] a, int i, int lastLeaf) {
    int left = leftChild(i);    
    int right = rightChild(i); 
    int largest;  
    
    if (left <= lastLeaf && a[left].compareTo(a[i]) > 0)
      largest = left; 
    else
      largest = i;    

    
    if (right <= lastLeaf && a[right].compareTo(a[largest]) > 0)
      largest = right; 

    if (largest != i) {
      swap(a, i, largest);
      maxHeapify(a, largest, lastLeaf);
    }
  }

 
  private void buildMaxHeap(E[] a, int lastLeaf) {
    int lastNonLeaf = (lastLeaf - 1) / 2; 
    for (int j = lastNonLeaf; j >= 0; j--)
      maxHeapify(a, j, lastLeaf);
  }


  private void swap(E[] a, int i, int j) {
    E t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  
  private static int leftChild(int i) {
    return 2 * i + 1;
  }

  
  private static int rightChild(int i) {
    return 2 * i + 2;
  }

  
  public static void printArray(Object[] a, int n) {
    for (int i = 0; i < n; i++)
      System.out.println(a[i]);
  }

  public static void main(String[] args) {
    final int SIZE = 25;      // size of the array to sort
    final int RANGE = 1000;   // upper limit of random ints generated

    Integer a[] = new Integer[SIZE];
    Random generator = new Random();
    HeapSort<Integer> sorter = new HeapSort<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < SIZE; i++) {
      a[i] = new Integer(generator.nextInt(RANGE));
      list.add(a[i]);
    }

    System.out.println("Original array:\n");
    printArray(a, SIZE);
    sorter.sort(a, SIZE);
    System.out.println("\nSorted array:\n");
    printArray(a, SIZE);
    
    System.out.println("Original ArrayList: " + list);
    sorter.sort(list);
    System.out.println("Sorted ArrayList: " + list);
  }
}