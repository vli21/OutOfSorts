public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    if (data[0]<data[1]){
      int temp=0;
      temp=data[1];
      data[1]=data[0];
      data[0]=temp;
    }
}
}
