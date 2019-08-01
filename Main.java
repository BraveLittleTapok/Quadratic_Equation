/**
 * Created by DS on 01.08.2019.
 */
public class Main {
    public static void main(String[] args) {
        QuadraticEquationStateless equationStateless = new QuadraticEquationStateless();
        equationStateless.quadraticEquationCalc(2, 10,5);
        QuadraticEquationStatefull equationStatefull = new QuadraticEquationStatefull(2, 10, 5);
        equationStatefull.quadraticEquationCalc();
      /*  quadraticEquationCalc(0, 4, 5); // not quadratic
        quadraticEquationCalc(2, -4, 2); // 1 solution
        quadraticEquationCalc(1, -2, -3); // 2 solutions
        quadraticEquationCalc(1, 4, 5); // Complex numbers*/
    }

}
