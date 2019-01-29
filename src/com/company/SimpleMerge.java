package com.company;

public class SimpleMerge
{
    public static int[] simpleMerge(int[] arr1, int[] arr2)
    {
        int end = arr1.length - 1;
        int end1 = arr2.length - 1;
        int start = 0;
        int start1 = 0;
        int count = arr1.length + arr2.length;
        int[] result = new int[count];
        int i = 0;
        while (start <= end && start1 <= end1)
        {
            if (arr1[start] <= arr2[start1])
            {
                result[i++] = arr1[start++];
            }
            else
            {
                result[i++] = arr2[start1++];
            }
        }
        while (start <= end)
        {
            result[i++] = arr1[start++];
        }
        while (start1 <= end1)
        {
            result[i++] = arr2[start1++];
        }
        return result;
    }
}
