import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {
    @org.junit.Test
    public void sum() throws Exception {
        Numbers numbers = new Numbers();
        int actual = numbers.sum( 5);
        int expected = 25; //input expected result for different result
        assertEquals(expected,actual);
    }
}