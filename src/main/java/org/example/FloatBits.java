package org.example;

import java.nio.ByteBuffer;

public class FloatBits {
    public String floatToBitsRow(Float a){
        int bits = Float.floatToIntBits(a);
        return String.format("%32s", Integer.toBinaryString(bits).replace(" ", "0"));
    }
    public Float bitsRowToFloat(String str){

        long decimal = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                decimal += Math.pow(2, (str.length() - i - 1));
            }
        }

        return Float.intBitsToFloat((int)decimal);
    }
    public byte[] floatTOBytes(Float a){
        return ByteBuffer.allocate(4).putFloat(a).array();
    }
}
