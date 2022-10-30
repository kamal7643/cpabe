package unisa.dia.gas.jpbc;

import java.math.BigInteger;

public interface Element extends ElementPow {
   Field getField();

   int getLengthInBytes();

   boolean isImmutable();

   Element getImmutable();

   Element duplicate();

   Element set(Element var1);

   Element set(int var1);

   Element set(BigInteger var1);

   BigInteger toBigInteger();

   Element setToRandom();

   Element setFromHash(byte[] var1, int var2, int var3);

   int setFromBytes(byte[] var1);

   int setFromBytes(byte[] var1, int var2);

   byte[] toBytes();

   Element setToZero();

   boolean isZero();

   Element setToOne();

   boolean isEqual(Element var1);

   boolean isOne();

   Element twice();

   Element square();

   Element invert();

   Element halve();

   Element negate();

   Element add(Element var1);

   Element sub(Element var1);

   Element mul(Element var1);

   Element mul(int var1);

   Element mul(BigInteger var1);

   Element mulZn(Element var1);

   Element div(Element var1);

   Element pow(BigInteger var1);

   Element powZn(Element var1);

   ElementPowPreProcessing pow();

   Element sqrt();

   boolean isSqr();

   int sign();
}
