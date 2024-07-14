package sortCollection;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        PrintArray pa = new PrintArray();
        InsertionSort is = new InsertionSort();
        FindTheLargest fl = new FindTheLargest();
        FindTheSmallest fs = new FindTheSmallest();
        RemoveOddNumbers ron = new RemoveOddNumbers();
        Scanner sc = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt())
        {
            arr_size = sc.nextInt();
        }

        // Initialize the array's size using user input
        int[] arr = new int[arr_size];

        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++)
        {
            if (sc.hasNextInt())
            {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Given array");
        pa.PrintArray(arr);

        // Find the largest number in array
        System.out.println("The Largest Number in array");
        pa.PrintArray(fl.findlargest(arr));

        // Find the smallest number in array
        System.out.println("The Smallest Number in array");
        pa.PrintArray(fs.findsmallest(arr));

        // Remove odd numbers from the array and print the result
        System.out.println("Removing odd numbers from the array");
        ron.removeOddNumbers(arr);

        // Find the minimum number and compare with key if the minimum number is greater than key, it will be moving ahead
        System.out.println("Insertion Sorted array");
        pa.PrintArray(is.insort(arr));

        // Find the minimum number and swap to first
        System.out.println("Selection Sorted array");
        pa.PrintArray(ob.selsort(arr));
    }
}
