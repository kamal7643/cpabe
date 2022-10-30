package unisa.dia.gas.jpbc;

import java.io.Serializable;
import java.math.BigInteger;


public interface CurveParameters extends Serializable {
   boolean containsKey(String var1);

   String getString(String var1);

   String getString(String var1, String var2);

   int getInt(String var1);

   int getInt(String var1, int var2);

   BigInteger getBigInteger(String var1);

   BigInteger getBigInteger(String var1, BigInteger var2);

   long getLong(String var1);

   long getLong(String var1, long var2);

   byte[] getBytes(String var1);

   byte[] getBytes(String var1, byte[] var2);

   String toString(String var1);
}
