import java.util.Arrays; 
import java.util.Collections; 

 public class testcase 
{ 
    public static void kLargest(Integer [] arr, int k)  
    { 
        Arrays.sort(arr, Collections.reverseOrder());  
    for (int i = 0; i < k; i++)  
    System.out.print(arr[i] + " "); 
    }  
      
      
    public static void main(String[] args)  
    { 
        Integer arr[] = new Integer[]{1, 23, 15, 9,  
                                       30, 5, 50}; 
        int k = 45; 
        kLargest(arr,k);      
    } 
} 
