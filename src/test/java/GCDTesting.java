import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class GCDTesting {
    @ParameterizedTest(name = "gcd({0}, {1}) return {2}")
    @CsvSource({
            "150,    1,    1",
            "150,    2,    0",
            "150,  299,    1",
            "150,  300,    0",
            "150,  150,    0",
            "  1,  150,    1",
            "  2,  150,    0",
            "299,  150,    1",
            "300,  150,    0",
            "150,  301,   -1",
            "301,  150,   -1",
            "  0,  150,   -1",
            "150,    0,   -1"

    })
    @DisplayName("Kiểm thử giá trị biên mạnh")
    void TestType1(int x, int y, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.gcd(x, y),
                () -> "gcd(" + x + ", " + y + ")"+ " should return " + expectedResult);
    }

    @ParameterizedTest(name = "gcd({0}, {1}) return {2}")
    @CsvSource({
            " 17,  41, 1",
            " 17,  10, 1",
            " 17, -10,-1",
            "100,  41, 1",
            "100,  10, 0",
            "100, -10,-1",
            "-10,  41,-1",
            "-10,  10,-1",
            "-10, -10,-1",
    })
    @DisplayName("Kiểm thử lớp tương đương mạnh")
    void TestType3(int x, int y, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.gcd(x, y),
                () -> "gcd(" + x + ", " + y + ")"+ " should return " + expectedResult);
    }
}
