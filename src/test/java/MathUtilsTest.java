/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rana
 */
public class MathUtilsTest {

    // Test that a negative altitude causes an exception.
    @Test
    public void testNegativeAltitudeThrowsException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> MathUtils.calculateGravitationalPotentialEnergy(-10)
        );
    }

    // Test that zero altitude returns zero energy.
    @Test
    public void testZeroAltitude() {

        assertEquals(
                0.0,
                MathUtils.calculateGravitationalPotentialEnergy(0),
                0.0001
        );
    }

    // Test a valid positive altitude.
    @Test
    public void testPositiveAltitude() {

        assertEquals(
                98.1,
                MathUtils.calculateGravitationalPotentialEnergy(10),
                0.0001
        );
    }
}
