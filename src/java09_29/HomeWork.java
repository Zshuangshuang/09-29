package java09_29;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-29
 * Time:8:18
 **/
public class HomeWork {
    public static void move(char pos1,char pos3){
        System.out.print(pos1+"->"+pos3+"  ");
    }
    public static void hanoiTower(int n,char pos1,char pos2,char pos3){
        if (n == 1){
            move(pos1,pos3);
            return;
        }
        hanoiTower(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanoiTower(n-1,pos2,pos1,pos3);
    }
    public static void main(String[] args) {
        hanoiTower(1,'A','B','C');
        System.out.println();
        hanoiTower(2,'A','B','C');
        System.out.println();
    }
}
