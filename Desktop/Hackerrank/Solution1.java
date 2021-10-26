import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int[] returnArray(int[] a) {
    // Write your code here
    
    int[] b=new int[a.length];
    for(int i=0;i<a.length;i++){
        b[i]=a[a.length-1-i];
    }
    return b ;
    }

}

public class Solution1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
          a[i]  =sc.nextInt();
        }
        Result R=new Result();
        int c[]=R.returnArray(a);
        for(int i=0;i<N;i++){
          System.out.print(c[i]);
          System.out.print(" ");
        }
      
    }
}