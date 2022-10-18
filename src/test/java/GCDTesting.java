import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class GCDTesting {
    @ParameterizedTest(name = "gcd({0}, {1}) return {2}")
    @CsvSource({
            "  0,  100,   -1",
            " 10,   10,    0",
            " 10,    4,    0",
            " 10,    1,    1",

    })
    @DisplayName("Kiểm thử luồng điều khiển")
    void TestType1(int x, int y, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.gcd(x, y),
                () -> "gcd(" + x + ", " + y + ")"+ " should return " + expectedResult);
    }

}
