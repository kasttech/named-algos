public class Main
{

 /*Fuction to get gcd of a and b*/
 public static int gcd(int a, int b) 
 { 
 if (b == 0) 
 return a; 
 else
 return gcd(b, a % b); 
 }

 /*Function to left rotate array of by d number of rotations*/
 public static void leftRotate(int arr[], int d, int n) 
 { 
 int i, j, k, temp; 
 for (i = 0; i < gcd(d, n); i++) // gcd(d,n) times the loop will iterate
 { 
 /* move i-th values of blocks */
 temp = arr[i]; 
 j = i; 
 while (true) { 
 k = j + d; 
 if (k >= n) // The element has to be shifted to its rotated position
 k = k - n; 
 if (k == i) // The element is already in its rotated position
 break; 
 arr[j] = arr[k]; 
 j = k; 
 } 
 arr[j] = temp; 
 }} 
 
//  Main function
 public static void main(String[] args) 
 { 
 int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
 int no_of_rotations = 2;
 int n = arr.length;
 System.out.println("Array Elements before rotating : "); 
 for(int i = 0 ; i < n ; i++)
 {
 System.out.print(arr[i]+ " "); // Printing elements before rotation
 }
 leftRotate(arr, no_of_rotations, n); 
 System.out.println("\nArray Elements after rotating : "); 
 for(int i = 0 ; i < n ; i++)
 {
 System.out.print(arr[i] + " "); // Printing elements after rotation
 } } }
