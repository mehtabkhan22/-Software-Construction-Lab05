/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Rana
 */
/**
 * Utility class for mathematical calculations.
 */
public class MathUtils {

    /**
     * Calculates gravitational potential energy for a 1 kg mass.
     *
     * @param altitude altitude in meters relative to sea level. Requires
     * altitude >= 0.
     * @return gravitational potential energy in joules.
     * @throws IllegalArgumentException if altitude is negative.
     */
    public static double calculateGravitationalPotentialEnergy(
            double altitude) {

        // Fail fast if the precondition is violated.
        if (altitude < 0) {
            throw new IllegalArgumentException(
                    "Altitude cannot be negative.");
        }

        double g = 9.81;
        double mass = 1.0;

        return mass * g * altitude;
    }
}
