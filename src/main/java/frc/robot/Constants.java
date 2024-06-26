// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  //Constants used for the shooter.
  public static class ShooterConstants {

    public static final int topShooter = 10;
    public static final int bottomShooter = 11;

    // Current limit for launcher and feed wheels
    public static final int kLauncherCurrentLimit = 80;
    public static final int kFeedCurrentLimit = 80;
    
    // Speeds for wheels when intaking and launching. Intake speeds are negative to run the wheels
    // in reverse
    public static final double kLauncherSpeed = 1;
    public static final double kLaunchFeederSpeed = 1;
    public static final double kIntakeLauncherSpeed = -1;
    public static final double kIntakeFeederSpeed = -.2;
    
    public static final double kLauncherDelay = 1;
  }

  //Constants used for the LEDs.
  public static class LedConstants {

  }

  //Constants used for the operator controllers.
  public static class OperatorConstants {
    public static final int driveController = 0;

    public static final double LEFT_X_DEADBAND = 0.1;
    public static final double LEFT_Y_DEADBAND = 0.1;
    public static final double RIGHT_X_DEADBAND = 0.1;
    public static final double RIGHT_Y_DEADBAND = 0.1;
  }

  public static class ClimbConstants {
    // ==== MOTORS - FALCON 500s ====
    public static final int RIGHT_CLIMB_ID = 12;
    public static final int LEFT_CLIMB_ID = 13;

    // ==== RATIOS ====
    public static final double RATIO_WINCH = 20.25;
}

  //Constants used in the swerve subsystem.
  public static class SwerveConstants {
    public static final double driveGearRatio = 6.54;
    public static final double angleGearRatio = 15.43;

    public static final double wheelRadiusInches = 4.0;

    public static final double driveEncoderResolution = 1;
    public static final double angleEncoderResolution = 1;

    public static final double driverConversionFactor = 0.048805170276;

    public static final double angleConversionFactor = 23.3311730395;

    public static final double MAX_VELOCITY_METERS = 16;

    public static final double MAX_ACCELERATION_METERS = 5.0;

    // =======================================================
    // ====================== PID ============================

    public static final double AUTO_DRIVE_P = 20;
    public static final double AUTO_DRIVE_I = 0;
    public static final double AUTO_DRIVE_D = 0;
    public static final double AUTO_DRIVE_F = 0;

    // =======================================================
  }
}
