/**
 * Created by Shabanova Dinara on 25.07.2019.
 */
public class Quadratic_Equation {
    public static void main(String[] args) {
        quadraticEquationCalc(0, 4, 5); // not quadratic
        quadraticEquationCalc(2, -4, 2); // 1 solution
        quadraticEquationCalc(1, -2, -3); // 2 solutions
        quadraticEquationCalc(1, 4, 5); // Complex numbers
    }

    private static void quadraticEquationCalc(float a, float b, float c) {
        if (a == 0) {
            System.out.println("Equation:  " + b + "x + " + c + " = 0 is not quadratic!");
        } else {
            System.out.print("Equation:  " + a + "x^2 + " + b + "x + " + c + " = 0 ");
            double discriminant = (b * b - 4 * a * c);
            switch (getNumberOfSolutions(discriminant)) {
                case 1:
                    double root = getRootWithPlus(a,b,discriminant);
                    System.out.println("has one solution: " + root);
                    break;
                case 2:
                    double root1 = getRootWithPlus(a, b, discriminant);
                    double root2 = getRootWithMinus(a, b, discriminant);
                    System.out.println("has 2 solutions: " +
                            "\nx1 = " + root1 + "\nx2 = " + root2);
                    break;
            }
        }
    }

    private static int getNumberOfSolutions(double discriminant) {
        if (discriminant == 0) {
            return 1;
        } else if (discriminant > 0) {
            return 2;
        } else {
            return 0;
        }
    }

    private static double getRootWithPlus(double a, double b, double discriminant) {
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    private static double getRootWithMinus(double a, double b, double discriminant) {
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}
