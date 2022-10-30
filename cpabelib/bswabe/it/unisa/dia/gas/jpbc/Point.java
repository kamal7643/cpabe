package unisa.dia.gas.jpbc;

public interface Point<E extends Element> extends Element, Vector<E> {
   E getX();

   E getY();

   int getLengthInBytesCompressed();

   byte[] toBytesCompressed();

   int setFromBytesCompressed(byte[] var1);

   int setFromBytesCompressed(byte[] var1, int var2);

   int getLengthInBytesX();

   byte[] toBytesX();

   int setFromBytesX(byte[] var1);

   int setFromBytesX(byte[] var1, int var2);
}
