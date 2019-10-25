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
public class RandomNumberGenerator {

    /**
     * The seed. This is the number set by setSeed and which is used in next.
     */
    private long seed;

    /**
     *
     * @param seed
     */
    public RandomNumberGenerator(long seed) {
        setSeed(seed);
    }

    /**
     * Sets the seed for this pseudorandom number generator. Two instances of
     * the same RandomNumberGenerator class, starting with the same seed, should
     * produce the same results, if the same methods are called.
     *
     * @param seed the new seed
     */
    public synchronized void setSeed(long seed) {
        this.seed = (seed ^ 0x5DEECE66DL) & ((1L << 48) - 1);
    }

    /**
     * Generates the next pseudorandom number. This returns an int value whose
     * bits low order bits are independent chosen random bits (0 and 1 are
     * equally likely).
     *
     * @param bits the number of random bits to generate
     * @return the next pseudorandom value
     */
    protected synchronized int next(int bits) {
        seed = (seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1);
        return (int) (seed >>> (48 - bits));
    }

    /**
     * Generates the next pseudorandom number. This returns a value between
     * 0(inclusive) and n(exclusive), and each value has the same likelihood
     * @param n
     * @return 
     */
    public int nextInt(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if ((n & -n) == n) {  // i.e., n is a power of 2
            return (int) ((n * (long) next(31)) >> 31);
        }
        int bits, val;
        do {
            bits = next(31);
            val = bits % n;
        } while (bits - val + (n - 1) < 0);
        return val;
    }
}
