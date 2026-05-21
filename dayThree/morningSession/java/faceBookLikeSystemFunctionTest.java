import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class faceBookLikeSystemFunctionTest {

    @Test
    public void testThatTheArrayReturnsACount() {

        String[] input = {};

        String expected = "no one likes this";

        String actual = faceBookLikeSystemFunction.checkIfPeopleLiked(input);

        assertEquals(expected, actual);

    }

}
