import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        double width = scanner.nextDouble();
        System.out.println("nhap chieu rong: ");
        double height = scanner.nextDouble();
        rectangle hcn = new rectangle(width, height);
        System.out.println("hinh chu nhat cua ban: " + hcn.display());
        System.out.println("dien tich la: " + hcn.getArea());
        System.out.println("chu vi la: " + hcn.getPerimeter());
    }
}
