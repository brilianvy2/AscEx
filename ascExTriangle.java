import java.util.Scanner;

class ascExTriangle {
    public static void main(String[] args) {
        int height;

        System.out.println("Pick a triangle to create [1-3]: ");
        System.out.println("1. Right angled triangle");
        System.out.println("2. Upside down right angled triangle");
        System.out.println("3. Isosceles triangle");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        System.out.println("Height of triangle: ");
        height = input.nextInt();

        if (choice == 1){
            for (int i = 0; i < height; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }

        }

        else if (choice == 2){
            for (int i = 0; i < height; i++) {
                System.out.println();
                for (int n = 0; n < i; n++) {
                    System.out.print(" ");
                }
                for (int j = height - i; j > 0; j--) {
                    System.out.print("*");
                }
            }
        }

        else if (choice == 3) {
            for (int i = 0; i < height; i++) {
                System.out.println();
                for (int n = height - i; n > 0; n--) {
                    System.out.print(" ");
                }
                for (int j = height - i - i; j <= height; j++) {
                    System.out.print("*");
                }
            }
        }

        else{
            System.out.println("Choice doesn't exist!");
            System.exit(0);
        }
    }
}