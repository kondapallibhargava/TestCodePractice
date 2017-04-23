import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: bkondapalli
 * Date: 3/20/17
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Practice {
    public static void main(String[] args){
        int arr[]={4,2,6,9,1};
        System.out.println("tets");
//        System.out.println(reverseString("hello"));
//        System.out.println(isStringPalindrome("abba"));
//        for(int a:arr)          {
//            System.out.print(a+" ");
//        }
//        sortArray(arr);
//        System.out.println();
//        for(int a:arr)          {
//            System.out.print(a+" ");
//        }
        System.out.println();
        System.out.println("Fib number is: "+fibNumber(7));
        if(isAnagram("cat","act")){
            System.out.println("Yes it is");
        }
    }

    public static String reverseString(String s){
        String result = "";
        for(char c : s.toCharArray()){
            result = c + result;
        }
        return result;
    }

    static boolean isStringPalindrome(String s){
        char[] cArr = s.toLowerCase().toCharArray();
        for(int i=0;i<s.length()/2;i++){
            if(cArr[i]==cArr[s.length()-1])
                return true;
        }
       return false;
    }

    static int[] sortArray(int[] array){
        int temp;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;

    }

    static int fibNumber(int n){
        if(n==1 || n==2)
            return 1;
        else
            return fibNumber(n-1)+fibNumber(n-2);
    }

    static boolean isAnagram(String s1, String s2){
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();

        return true;
    }
}
