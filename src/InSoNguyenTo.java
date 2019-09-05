import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to muon in");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        int i =1;
        while (count < number) {
            i++;
            for (int j = 2; j < i - 1; j++)
                if (i % j == 0) {
                    N = 3;
                }
            if (N == 2) {
                System.out.println(i);
                count++;
                if (count == number) {
                    break;
                }
            }
            N = 2;
        }
    }
}