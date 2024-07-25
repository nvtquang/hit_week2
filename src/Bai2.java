import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                if(i == n - 1){
                    numbers[i] += Math.abs(numbers[i - 1]);
                }
                else {
                    numbers[i] += Math.abs(numbers[i - 1] - numbers[i + 1]);
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
