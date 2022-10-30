package unisa.dia.gas.jpbc;

import java.math.BigInteger;

public interface ElementPowPreProcessing extends ElementPow, PreProcessing {
   Field getField();

   Element pow(BigInteger var1);

   Element powZn(Element var1);
}
