/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seminar3ex1;

/**
 *
 * @author Razvan
 */
public class Seminar3Ex1 {

    int binarySearch(int arr[], int l, int r, int x)
    {
       
    while (l <= r) {
        int m = l + (r - l) / 2;

        // Check if x is present at mid
        if (arr[m] == x)
            return m;

        // If x greater, ignore left half
        if (arr[m] < x)
            l = m + 1;

        // If x is smaller, ignore right half
        else
            r = m - 1;
    }
        // We reach here when element is not present in array.
        return -1;
    }
    
    
    // Driver method to test above.
    public static void main(String args[])
    {
        Seminar3Ex1 ob = new Seminar3Ex1();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present.");
        else
            System.out.println("Element found at index " +
                                                 result + ".");
    }
}
