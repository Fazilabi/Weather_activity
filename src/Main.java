import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double degree;

        System.out.print("Enter the weather degree :");
        degree = input.nextDouble();
        System.out.println("degree is : " + degree);
        if (degree < (-30) || degree > 45) {
            System.out.println("Danger, stay at home...");
        } else if (degree < 5) {
            System.out.println("weather is suit for skiing");
        } else if (degree >= 5 && degree <= 15) {
            System.out.println("Let's go to the cinema");

        } else if (degree > 15 && degree <= 25) {
            System.out.println("Picnic time");

        } else {
            System.out.println("Perfect weather for swimming");
        }


    }
}