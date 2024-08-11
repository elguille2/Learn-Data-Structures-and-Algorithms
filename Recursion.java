public class Recursion {



    public static void main(String[] args) {

        walk(5);
        System.out.println("Recursion Walk");
        recursionWalk(5);
//        recursionWalk(100000); // StackOverflowError - Too many recursive calls -> runs out of memory

        System.out.println("7!: " + factorial(7));

        System.out.println("2^4: " + power(2, 4));

    }

    private static void walk(int steps) {

        for (int i = 0; i < steps; i++){
            System.out.println("You take a step");
        }

    }

    private static void recursionWalk(int steps) {

        if (steps == 0) return; // Base case
        System.out.println("You take a step");

        recursionWalk(steps - 1); // Recursive call
    }

    private static int factorial(int num) {

        if (num < 1) return 1; // Base case

        return num * factorial(num - 1); // Recursive call

    }

    private static int power(int base, int exponent) {

        if (exponent == 0) return 1; // Base case

        return base * power(base, exponent - 1); // Recursive call

    }

}
