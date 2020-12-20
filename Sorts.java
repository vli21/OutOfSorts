public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i=0;i< data.length-1;i++){
      boolean sorted=false;
      for (int j=0; j < data.length-(i+1);j++){
        if (data[j]>data[j+1]){
          int temp=data[j+1];
          data[j+1]=data[j];
          data[j]=temp;
          sorted=true;
        }
      }
      if (sorted=false){
        i=data.length;
      }
    }
  }

  public static void selectionSort(int[] data){

    for (int i=0; i<data.length;i++){
      int index=i;
      for (int j=data.length-1;j>=i;j--){
        if (data[j]<data[index]){
          index=j;
        }
      }
      int temp= data[index];
      data[index]=data[i];
      data[i]=temp;
    }
   }

   /**insertion sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */
   public static void insertionSort(int[] data){
   }
}
