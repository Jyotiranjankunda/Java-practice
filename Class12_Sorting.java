public class Class12_Sorting {
  public static void main(String[] args) {
    // Bubble sort - T.c = O(n^2)
    int[] arr1 = { 7, 8, 3, 1, 2 };
    for (int i = 0; i < arr1.length - 1; i++) {
      for (int j = 0; j < arr1.length - i - 1; j++) {
        if (arr1[j] > arr1[j+1]) {
          // swap
          int temp = arr1[j];
          arr1[j] = arr1[j+1];
          arr1[j+1] = temp;
        }
      }
    }
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();

    // Selection sort : T.c. = O(n^2)
    // Ek iteration me ek swap - sabse chote wale ko aage le aayenge
    int[] arr2 = {5,8,1,9,2,3,0,4};
    for(int i=0; i<arr2.length-1; i++){
      int smallest = i;
      for(int j=i+1; j<arr2.length; j++){
        if(arr2[j] < arr2[smallest]){
          smallest = j;
        }
      }
      int temp = arr2[smallest];
      arr2[smallest] = arr2[i];
      arr2[i] = temp;
    }

    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();

    // Insertion sort : T.C. = O(n^2)
    // array ke 2 parts honge, pehla sorted part, dusra unsorted part. 
    // Pehle 1st element ko sorted array manenge, baki pure array ko unsorted array.
    // unsorted array me traverse krenge aur har element ko sorted array se compare krke uski correct position me use place krenge.. i.e, sorted walo ko ek ek krke right ki taraf shift krke unsorted wale ko uski position tak le jayenge
    
    int[] arr3 = {5,3,4,1,8,9};
    for(int i=1; i<arr3.length; i++){
      int current = arr3[i];
      int j = i-1;
      while (j >= 0 && current < arr3[j]) {
        arr3[j+1] = arr3[j];
        j--;
      }
      arr3[j+1] = current;
    }

    for (int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + " ");
    }
    System.out.println();
  }
}

