package com.ejpm.euler.utils.math.sequences;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.ejpm.euler.utils.math.sequences.TriangularNumberSequence;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author edgar.mateus
 */
@RunWith(Parameterized.class)
public class TriangularSequenceTest {
    
    private final int n;
    private final int result;
    private final TriangularNumberSequence sequence;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {1, 1}, {2, 3}, {3, 6}, {4, 10}, {5, 15}, {6, 21},{7, 28}, {8, 36}
        });
    }

    public TriangularSequenceTest(final int n, final int result) {
        this.n = n;
        this.result = result;
        this.sequence = new TriangularNumberSequence();
    }

    @Test
    public void checkIfPrime() {
        assertThat(sequence.getElement(n), is(equalTo(result)));
    }

}
