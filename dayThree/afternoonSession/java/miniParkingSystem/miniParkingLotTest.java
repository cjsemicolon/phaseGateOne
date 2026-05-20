import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class miniParkingLotTest {

    @Test
    public void testTheParkingSpacesAreTwenty() {

        int[] input = {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };

         int[] expected = {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };

            int actual = miniParkingLot.generateParkingList(input);
        
        assertArrayEquals(expected, actual); 

}
