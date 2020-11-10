import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fruitName;
        int n;
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();
        System.out.println("nhap so luong so loai trai cay:");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap cac loai trai cay");
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập tên loại trái cây thứ " + i + ": ");
            fruitName = scanner.nextLine();
            hashSet.add(fruitName);
        }
        System.out.println(hashSet);
        System.out.println("nhap loai trai cay can tim:");
        fruitName = scanner.nextLine();
        if (!hashSet.contains(fruitName)){
            System.out.println("chua co loai " + fruitName+" trong hashSet");
        }else {
            System.out.println("loai " + fruitName+" da co trong hashSet");
        }
    }
}
