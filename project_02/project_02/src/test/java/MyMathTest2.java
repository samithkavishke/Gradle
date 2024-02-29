import org.example.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest2 {
    @Test
    public void testSubtract() throws InterruptedException {
        MyMath myMath = new MyMath();
        Thread.sleep(3000);
        int result = myMath.subtract(2, 1);
        assertEquals(1, result);
    }
}
