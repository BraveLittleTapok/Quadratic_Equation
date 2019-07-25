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
        float root1;
        float root2;
        if (a == 0){
            System.out.println("Equation:  "+ b + "x + " + c + " = 0 is not quadratic!");
        }else {
            System.out.print("Equation:  " + a + "x^2 + " + b + "x + " + c + " = 0 ");
            float discriminant = (b * b - 4 * a * c);
            int numberOfSolutions = getNumberOfSolutions(discriminant);
            switch (numberOfSolutions) {
                case 1:
                    root1 = -b / (2 * a);
                    System.out.println("has one solution: " + root1);
                    break;
                case 2:
                    root1 = (float) ((-b + Math.sqrt(discriminant)) / (2 * a));
                    root2 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
                    System.out.println("has 2 solutions: " +
                            "\nx1 = " + root1 + "\nx2 = " + root2);
                    break;
                case 0:
                    discriminant = (-1) * discriminant;
                    System.out.println("doesn't has real roots, " +
                            "but has complex roots: \n" + getComplexRoots(a, b, discriminant));
                    break;
            }
        }
    }

    private static int getNumberOfSolutions(float discriminant) {
        if (discriminant == 0) {
            return 1;
        } else if (discriminant > 0) {
            return 2;
        } else {
            return 0;
        }
    }
    private static String getComplexRoots(float a, float b, float discriminant) {
        float firstCoefficient = -b / (2 * a);
        float secondCoefficient = (float) (Math.sqrt(discriminant) / (2 * a));
        return ("x1 = "+ firstCoefficient + " + " + secondCoefficient + "i \nx2 = " +
                firstCoefficient + " - " + secondCoefficient + "i");
    }

}
