package java09_29;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-29
 * Time:8:08
 **/
public class TestDemo {
    public static int fab(int n){
        if (n == 1 || n==2){
            return 1;
        }
        return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fab(n));
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static int func(int n){
        if (n >0 && n<9){
            return n;
        }
        return (n%10)+func(n/10);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func(n));
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = sum(n);
        System.out.println(ret);
    }
}
