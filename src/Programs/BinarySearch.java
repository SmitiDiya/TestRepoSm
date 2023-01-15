package Programs;

import java.util.Arrays;
class BinarySearch{
 public static void binarySearch(int arr[], int first, int last, int key){
System.out.println(first + last);
   int mid = (first + last)/2;
System.out.println(mid);
   while( first <= last ){
      if ( arr[mid] < key ){
        first = mid + 1; 
System.out.println(first);  
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if ( first > last ){
      System.out.println("Element is not found!");
   }
 }
 public static void main(String args[]){
		int arr[] = {10,20,30,40,50,60};
		int arr2[]= {10,20,30,40,50,60};
Arrays.sort(arr);


               		int key = 50;
        int last=arr.length-1;
		binarySearch(arr,0,last,key);	
 }
}
