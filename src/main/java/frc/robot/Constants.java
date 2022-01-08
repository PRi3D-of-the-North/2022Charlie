// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int DRIVETRAIN_LEFT_MOTOR_1 = 1,    // TalonFX
                            DRIVETRAIN_LEFT_MOTOR_2 = 2,
                            DRIVETRAIN_LEFT_MOTOR_3 = 3,
                            DRIVETRAIN_RIGHT_MOTOR_1 = 4,
                            DRIVETRAIN_RIGHT_MOTOR_2 = 5,
                            DRIVETRAIN_RIGHT_MOTOR_3 = 6;

    public static final int COMPRESSOR = 0,                 // Pneumatics Hub
                            DRIVETRAIN_SHIFTING_SOLENOID_FORWARD = 0,
                            DRIVETRAIN_SHIFTING_SOLENOID_REVERSE = 1;
}
