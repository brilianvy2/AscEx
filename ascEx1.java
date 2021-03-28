import java.util.Scanner;

class ascEx1 {
    private static double weight(double mass, double acceleration) {
        return mass * acceleration;
    }
    public static void main(String[] args) {
        double mass;
        double acceleration = 0;
        

        System.out.println("Choose a planet [1-4]: ");
        System.out.println("1. Earth");
        System.out.println("2. Moon");
        System.out.println("3. Mercury");
        System.out.println("4. Jupiter");
        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1){
            acceleration = 9.81;    
        }
        else if (choice == 2){
            acceleration = 1.82;
        }
        else if (choice == 3){
            acceleration = 3.59;
        }
        else if (choice == 4){
            acceleration = 25.59;
        }
        else{
            System.out.println("Choice doesn't exist!");
            System.exit(0);
        }
        
        System.out.println("Input your mass: ");
        mass = input.nextDouble();


        System.out.println("Your weight is " + weight(mass, acceleration) + " Newton");
        

    }
}