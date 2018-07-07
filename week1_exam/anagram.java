import java.io.*;
import java.util.*;
class Anagram
{
     
    public static boolean areAnagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2)
            return false;
        quickSort(str1, 0, n1 - 1);
        quickSort(str2, 0, n2 - 1);
        for (int i = 0; i < n1;  i++)
            if (str1[i] != str2[i])
                return false;
  
        return true;
    }
    public static void exchange(char A[],int a, int b)
    {
        char temp;
        temp = A[a];
        A[a]   = A[b];
        A[b]   = temp;
    }
  
    public static int partition(char A[], int si, int ei)
    {
        char x = A[ei];
        int i = (si - 1);
        int j;
      
        for (j = si; j <= ei - 1; j++)
        {
            if(A[j] <= x)
            {
                i++;
                exchange(A, i, j);
            }
        }
        exchange (A, i+1 , ei);
        return (i + 1);
    }
    public static void quickSort(char A[], int si, int ei)
    {
        int pi;    
        if(si < ei)
        {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }
  
    public static void main(String args[])
    {
        Scanner v=new Scanner(System.in);
        String s=v.nextLine().toLowerCase();
        String t=v.nextLine().toLowerCase();
        if (areAnagram(s.toCharArray(), t.toCharArray()))
            System.out.println("True");
        else
            System.out.println("false");
    }
}