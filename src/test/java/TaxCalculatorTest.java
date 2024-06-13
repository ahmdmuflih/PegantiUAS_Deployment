package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.TaxCalculator;

public class TaxCalculatorTest {
    @Test
    public void testCalculateTax() {
        // Test calculateTax 
        assertEquals(100.0, TaxCalculator.calculateTax(1000.0, 0.10), 0.01);
        assertEquals(150.0, TaxCalculator.calculateTax(1000.0, 0.15), 0.01);
    }

    @Test
    public void testGetTaxRate() {
        // Test getTaxRate method pekerjaan berbeda dan kendaraan berbeda
        assertEquals(0.12, TaxCalculator.getTaxRate("pegawai", 0, 0), 0.01);
        assertEquals(0.16, TaxCalculator.getTaxRate("pegawai", 1, 1), 0.01);
        assertEquals(0.19, TaxCalculator.getTaxRate("wirausaha", 1, 1), 0.01);
        assertEquals(0.16, TaxCalculator.getTaxRate("freelancer", 1, 2), 0.01);
        assertEquals(0.13, TaxCalculator.getTaxRate("lainnya", 1, 2), 0.01);
    }

    @Test
    public void testGetJobType() {
        // Test getJobType method for untuk valid input
        assertEquals("Pegawai", TaxCalculator.getJobType(1));
        assertEquals("Wirausaha", TaxCalculator.getJobType(2));
        assertEquals("Freelancer", TaxCalculator.getJobType(3));
        assertEquals("Lainnya", TaxCalculator.getJobType(4));

        // Test getJobType method untuk invalid input
        assertEquals("Invalid", TaxCalculator.getJobType(0));
        assertEquals("Invalid", TaxCalculator.getJobType(5));
    }
}
