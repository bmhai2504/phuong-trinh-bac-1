import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a;
        float b;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap so a ( a != 0): ");
            a = scanner.nextFloat();
        }while (a == 0);

        System.out.println("Nhap so b: ");
        b = scanner.nextFloat();

        float x = -(b / a);
        System.out.println("Nghiem cua phuong trinh: " + x);

    }
}
