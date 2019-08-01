/**
 * Created by DS on 01.08.2019.
 */
public class QuadraticEquationStatefull {
    private double a;
    private double b;
    private double c;

    public QuadraticEquationStatefull(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void quadraticEquationCalc() {
        if (a == 0) {
            printEquationNotQuadratic();
        } else {
            printQuadraticEquation();
            switch (getNumberOfSolutions(getDiscriminant(a, b, c))) {
                case 1:
                    double root = getRootWithPlus(a, b, getDiscriminant(a, b, c));
                    System.out.println("has one solution: " + root);
                    break;
                case 2:
                    double root1 = getRootWithPlus(a, b, getDiscriminant(a, b, c));
                    double root2 = getRootWithMinus(a, b, getDiscriminant(a, b, c));
                    printRoots(root1, root2);
                    break;

                case 0:
                    System.out.println("No solutions");
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

    private void printEquationNotQuadratic() {
        System.out.println("Equation:  " + b + "x + " + c + " = 0 is not quadratic!");

    }

    private void printQuadraticEquation() {
        System.out.println("Equation:  " + a + "x^2 + " + b + "x + " + c + " = 0 ");

    }

    private void printRoots(double root1, double root2) {
        System.out.println("has 2 solutions: " +
                "\nx1 = " + root1 + "\nx2 = " + root2);

    }

    private double getDiscriminant(double a, double b, double c) {
        return (b * b - 4 * a * c);
    }
}
