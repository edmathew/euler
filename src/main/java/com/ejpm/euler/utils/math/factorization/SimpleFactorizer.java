package com.ejpm.euler.utils.math.factorization;

import com.ejpm.euler.utils.math.prime.PrimeFactor;
import com.ejpm.euler.utils.math.prime.PrimeNumber;

import java.util.List;

/**
 *
 * @author edgar.mateus
 */
public class SimpleFactorizer {

    public int getFactorsQuantity(final int n) {
        final List<PrimeFactor> primeFactors = PrimeNumber.primeFactorization(n);
        int factorsQuantity = 1;
        factorsQuantity = primeFactors.stream()
                .map((primeFactor) -> primeFactor.getPrimeExponent() + 1)
                .reduce(factorsQuantity, (accumulator, _item) -> accumulator * _item);

        return factorsQuantity;
    }
}
