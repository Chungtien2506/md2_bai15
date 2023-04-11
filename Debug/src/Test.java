import java.util.Scanner;

public class Test  extends  Exception{
    public  Test(String message){
        super(message);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập cạnh 1: ");
            int a = scanner.nextInt();
            System.out.print("Nhập cạnh 2: ");
            int b = scanner.nextInt();
            System.out.print("Nhập cạnh 3: ");
            int c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new Test("Cạnh của tam giác không được âm.");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new Test("Tổng 2 cạnh không lớn hơn cạnh còn lại.");
            }

            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " hợp thành một tam giác.");
        } catch (Test e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Đầu vào không hợp lệ.");
        }
    }
    }

