import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float banKinh = sc.nextFloat();
        float Pi = 3.14F;
        float chuVi = 2 * Pi * banKinh;
        float dienTich = (float) Math.pow(banKinh, 2) * Pi;
        System.out.printf("%.3f %.3f", chuVi, dienTich);
    }
}
