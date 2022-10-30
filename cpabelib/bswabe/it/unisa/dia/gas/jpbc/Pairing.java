package unisa.dia.gas.jpbc;

public interface Pairing {
   boolean isSymmetric();

   Field getG1();

   Field getG2();

   Field getGT();

   Field getZr();

   Element pairing(Element var1, Element var2);

   Element pairing(Element[] var1, Element[] var2);

   PairingPreProcessing pairing(Element var1);

   int getPairingPreProcessingLengthInBytes();

   PairingPreProcessing pairing(byte[] var1);

   PairingPreProcessing pairing(byte[] var1, int var2);

   boolean isAlmostCoddh(Element var1, Element var2, Element var3, Element var4);

   Pairing.PairingFieldIdentifier getPairingFieldIdentifier(Field var1);

   public static enum PairingFieldIdentifier {
      G1,
      G2,
      GT,
      Zr,
      Unknown;
   }
}
