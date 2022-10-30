package unisa.dia.gas.jpbc;

public interface FieldOver<F extends Field, E extends Element> extends Field<E> {
   F getTargetField();
}
