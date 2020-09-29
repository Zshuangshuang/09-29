package java09_29;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-29
 * Time:8:46
 **/
public class TestDemo2 {
    public static String MyToString(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length-1){
                str += ",";
            }
        }
        return  str+"]";
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        String ret = MyToString(arr);
        System.out.println(ret);
    }
    public static String MytoString(int[] arr){
        String tmp = "[";
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
            if (i != arr.length-1) {

                tmp += ",";
            }

        }
       return tmp+']';
    }
    public static void main3(String[] args) {
        int[] arr = {1,2,3,4};
        String ret = MytoString(arr);
        System.out.println(ret);
    }
    public static void swap(int[] arr){
        int ret = arr[0];
        arr[0] = arr[1];
        arr[1] = ret;
    }
    public static void main2(String[] args) {
        int[] arr = {10,20};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arr.length);
        for (int x:arr) {
            System.out.print(x+" ");
        }

    }
}
