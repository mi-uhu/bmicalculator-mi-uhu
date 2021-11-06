import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
    private BMICalculator m1;
    private BMICalculator w;
    private BMICalculator m2;

    private BMICalculator optional1;
    private BMICalculator optional2;

    @BeforeEach
    void setUp() {
        this.m1 = new BMICalculator("f", "l", 'm', 180, 80 );
        this.w = new BMICalculator("f", "l", 'w', 174, 52 );
        this.m2 = new BMICalculator("f", "l", 'm', 202, 114 );

        this.optional1 = new BMICalculator( "f", "l", 'm', 150, 150);
        this.optional2 = new BMICalculator( "f", "l", 'm', 200, 50);
    }

    @Test
    void calculateBMI() {
        Assertions.assertEquals(24.69, m1.calculateBMI());
        Assertions.assertEquals(17.18, w.calculateBMI());
        Assertions.assertEquals(27.94, m2.calculateBMI());

        Assertions.assertEquals(66.67, optional1.calculateBMI());
        Assertions.assertEquals(12.50, optional2.calculateBMI());
    }

    @Test
    void calculateBMICategory() {
        Assertions.assertEquals(0, m1.calculateBMICategory());
        Assertions.assertEquals(-1, w.calculateBMICategory());
        Assertions.assertEquals(1, m2.calculateBMICategory());

        Assertions.assertEquals(2, optional1.calculateBMICategory());
        Assertions.assertEquals(-2, optional2.calculateBMICategory());
    }

    @Test
    void getBMICategoryName() {
        Assertions.assertEquals("Normalgewicht", m1.getBMICategoryName());
        Assertions.assertEquals("Untergewicht", w.getBMICategoryName());
        Assertions.assertEquals("Übergewicht", m2.getBMICategoryName());

        Assertions.assertEquals("Sehr starkes Übergewicht", optional1.getBMICategoryName());
        Assertions.assertEquals("Sehr starkes Untergewicht", optional2.getBMICategoryName());
    }
}