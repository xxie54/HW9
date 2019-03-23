import java.util.Arrays;


class Reverse {

    public static int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for(int i = 0; i<n; i++){
            b[j-1] = a[i];
            j = j-1;
        }

        return b;
    }


}

class Palindrome extends Reverse {


    public static boolean checkPalindorme(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (Arrays.equals(array1, array2)) {
            return true;
        } else {
            return false;
        }

    }

}

public class Test {
    public static void main(String[] args) {

        Palindrome obj = new Palindrome();
        int arr1[] = {10,20,30,40};
        System.out.println("array1 is "+ Arrays.toString(arr1));
        int arr2[] = obj.reverse(arr1,4);
        System.out.println("array2 is "+ Arrays.toString(arr2));
        System.out.println("Is arr1 equals to arr2: " + obj.checkPalindorme(arr1, arr2));
    }

}