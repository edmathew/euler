package com.ejpm.euler.utils.math.prime;

/**
 * Representation of a prime factor and the occurrences of the same:
 *
 * (primeNumber) ^ (primeExponent)
 *
 * @author edgar.mateus
 */
public class PrimeFactor {

    private final int primeNumber;
    private final int primeExponent;

    public PrimeFactor(final int primeNumber, final int primeExponent) {
        this.primeNumber = primeNumber;
        this.primeExponent = primeExponent;
    }

    public int getPrimeNumber() {
        return primeNumber;
    }

    public int getPrimeExponent() {
        return primeExponent;
    }
    
    @Override
    public String toString(){
        return "[PrimeFactor] - " + primeNumber + "^" + primeExponent;
    }
}
