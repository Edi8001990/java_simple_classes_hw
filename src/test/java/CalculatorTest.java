import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculate;


    @Before

    public void before(){
        calculate = new Calculator(50, 10, 40);
    }


    @Test
    public void hasValue1(){
        assertEquals(50, calculate.getValue1());
    }

    @Test
    public void hasValue2(){
        assertEquals(10, calculate.getValue2());
    }

    @Test
    public void add(){
        assertEquals(60, calculate.add());

    }

    @Test
    public void substract(){
        assertEquals(40, calculate.substract());

    }

    @Test
    public void multiply(){
        assertEquals(500, calculate.multiply());

    }

    @Test
    public void divide(){
        assertEquals(5, calculate.divide());
    }

}
