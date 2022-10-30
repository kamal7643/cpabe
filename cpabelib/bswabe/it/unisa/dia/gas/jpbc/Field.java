package unisa.dia.gas.jpbc;

import java.math.BigInteger;

public interface Field<E extends Element> {
   E newElement();

   E newElement(int var1);

   E newElement(BigInteger var1);

   E newZeroElement();

   E newOneElement();

   E newRandomElement();

   BigInteger getOrder();

   boolean isOrderOdd();

   E getNqr();

   int getLengthInBytes();

   Element[] twice(Element[] var1);

   Element[] add(Element[] var1, Element[] var2);

   ElementPowPreProcessing pow(byte[] var1);

   ElementPowPreProcessing pow(byte[] var1, int var2);
}
