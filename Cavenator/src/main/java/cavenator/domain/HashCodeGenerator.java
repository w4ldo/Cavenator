/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavenator.domain;

/**
 *
 * @author Matias
 */
public class HashCodeGenerator {

    /**
     * Generate hashCode from string by adding numeric values of characters
     * multiplied by 31 (prime) raised to the power of string.lenght-1
     * (diminishing)
     *
     * @param string
     * @return 
     */
    public static int generateStringHashCode(String string) {
        int hc = 0;
        for (int i = 0; i < string.length(); i++) {
            int a = string.codePointAt(i) * (int) Math.pow(31, string.length() - (i + 1));
            hc += a;
        }
        return hc;
    }
}
