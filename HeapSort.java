//Jerry Ye
//APCS02 pd02
//HW51 -- Heaping Piles of Sordidness
//2018-05-21
import java.util.ArrayList;
public class HeapSort{
  public static int[] buildMinHeap(int[] mess){
    for(int i = 1; i < mess.length; i ++){
      for(int c = i;c != 0; c = (c-1)/2){
        if (c == 0)
          break;
        int currentNode = mess[c];
        int parentNode = mess[(c-1) / 2];
        if (currentNode > parentNode){
          break;
        }
        else{
          mess[c] = parentNode;
          mess[(c-1)/2] = currentNode;
          //System.out.println(parentNode + "parent");
          //          System.out.println(currentNode + "cur");
        } 
      }
    }
      return mess;
    }
  public static int[] heapSort(int[] nums){
    buildMinHeap(nums);
    //for (int a: nums){
    //System.out.print(a+ " ");
    // }
    for(int i = nums.length-1; i > 0; i--){
      remove(nums, i);
      System.out.println("");
      for (int a: nums){
        System.out.print(a + " ");
      }
    }
    return nums;
  }
  public static void remove(int[] nums, int i){
    int bound = i;
    int min = nums[0];
    nums[0] = nums[i];
    nums[i] = min;
    i = 0;
    while (i < bound){
      int rc = i*2 + 1;
      int lc = i*2 +2;
      int small = -1;
      if (rc >= bound)
        break;
      if (lc >= bound)
        small = rc;
      else if (nums[rc] > nums[lc]){
        small = lc;
      }
      else if(nums[lc] >= nums[rc]){
        small = rc;
      }
      System.out.println(nums[small]);
      if (nums[small] > nums[i]){
        break;
      }
      else {
        int temp = nums[small];
        nums[small] = nums[i];
        nums[i] = temp;
        i = small;
      }
    }
    
  }
  public static void main(String[] args){
    int[] a = {1,3,8,5,6,9,10,4,3};
    heapSort(a);
    //buildMinHeap(a);
    System.out.println("printing heap");
    for( int c :a ){      
      System.out.println(c);
    }
  }
}
