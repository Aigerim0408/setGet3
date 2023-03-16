import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(scanner.nextInt());
        rectangle.setSideB(scanner.nextInt());
        rectangle.setSideC(scanner.nextInt());
        rectangle.setSideD(scanner.nextInt());
        System.out.println(rectangle.getSideA() +"\n"+ rectangle.getSideB()+"\n" + rectangle.getSideC()
        + "\n" + rectangle.getSideD());
        System.out.println(rectangle.square());

    }
}