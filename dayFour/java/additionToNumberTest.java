import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class additionToNumberTest {

    @Test
    
    public void testThatTheArrayFunctionWorks(){

        int[] input = {8, 6, 12, 4, -2};

        int number = 6;

        int[] expected = {8, -2};

        int[] actual = additionToNumber.collectInput(input, number);

        assertArrayEquals(expected, actual);

    }

    @Test
    
    public void testThatThePrintNumbersBetweenFunctionWorks(){

        int[] input = {14, 9, 6, 5, 8, 10};

        int[] expected = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        int[] actual = additionToNumber.printNumbersInBetween(input);

        assertArrayEquals(expected, actual);

    }


}
