package uk.gegc.effectiveJava.part4;

/*Task: Implement the MathFunction interface with one method double
apply(double x), and create a skeleton implementation of AbstractMathFunction
that has default methods for derivative operations (e.g. double derivativeAt(double x)
returning an UnsupportedOperationException). Then provide a concrete
implementation for the function f(x)=x^2.*/

public interface MathFunction {
    public double apply(double x);
}
