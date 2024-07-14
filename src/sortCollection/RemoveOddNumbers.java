package sortCollection;

import java.util.ArrayList;

public class RemoveOddNumbers
{
    void removeOddNumbers(int[] arr)
    {
        ArrayList<Integer> removedNumbers = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i : arr)
        {
            if (i % 2 != 0)
            {
                removedNumbers.add(i);
            } else {
                newArray.add(i);
            }
        }

        // Print removed odd numbers
        System.out.println("Removed odd numbers:");
        for (int num : removedNumbers)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the new array without odd numbers
        System.out.println("Array without odd numbers:");
        for (int num : newArray)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
