package unisa.dia.gas.jpbc;

import java.util.List;

public interface Polynomial<E extends Element> extends Element, Vector {
   int getDegree();

   List<E> getCoefficients();

   E getCoefficient(int var1);
}
