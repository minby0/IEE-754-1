package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Float a = 0.5f;
        FloatBits floatBits = new FloatBits();
        String strPositive = floatBits.floatToBitsRow(a);
        String strNegative = floatBits.floatToBitsRow(-a);
        System.out.println(Arrays.toString(floatBits.floatTOBytes(a)));
        System.out.println(strPositive);
        System.out.println(strNegative);
        System.out.println(floatBits.bitsRowToFloat(strPositive));
        System.out.println(floatBits.bitsRowToFloat(strNegative));

    }
}
