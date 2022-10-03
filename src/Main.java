import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello world!");
        Friend aFriend = new Friend();
        Friend myFriend = new Friend("Aleks");
        Friend falseFriend = new Friend("William", false);
        System.out.println("aFriend has " + aFriend.getHp());
        System.out.println("how much damage?");
        int damage = myScanner.nextInt();

        aFriend.hit(damage);
        System.out.println("aFriend has " + aFriend.getHp());


    }
}