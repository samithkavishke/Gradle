import org.example.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest1 {

    @Test
    public void testAdd() throws InterruptedException {
        MyMath myMath = new MyMath();
        Thread.sleep(3000);
        int result = myMath.add(1, 2);
        assertEquals(3, result);
    }


}
