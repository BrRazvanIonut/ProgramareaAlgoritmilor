/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seminar3ex2;

/**
 *
 * @author Razvan
 */
public class Seminar3Ex2 {
  
    // Function to perform Ternary Search
    static int ternarySearch(int l, int r, int key, int ar[])
    {
        if (r >= l) {
  
            // Find the mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
  
            // Check if key is present at any mid
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }
  
            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region
            if (key < ar[mid1]) {
                // The key lies in between l and mid1
                return ternarySearch(l, mid1 - 1, key, ar);
            }
            else if (key > ar[mid2]) {
                // The key lies in between mid2 and r
                return ternarySearch(mid2 + 1, r, key, ar);
            }
            else {
                // The key lies in between mid1 and mid2
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
            }
        }
  
        // Key not found
        return -1;
    }
  
    // Driver code
    public static void main(String args[])
    {
        int low, high, position, key;
  
        // Get the array
        // Sort the array if not sorted
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  
        // Starting index
        low = 0;
        // Length of array
        high = 9;
  
        // Checking for 5
        // Key to be searched in the array
        key = 5;
  
        // Find position using ternarySearch
        position = ternarySearch(low, high, key, ar);
  
        // Print the result
        System.out.println("Index of " + key + " is " + position + ".");
  
        // Checking for 50
        // Key to be searched in the array
        key = 50;
  
        // Find position using ternarySearch
        position = ternarySearch(low, high, key, ar);
  
        // Print the result.
        System.out.println("Index of " + key + " is " + position +".");
    }
}
