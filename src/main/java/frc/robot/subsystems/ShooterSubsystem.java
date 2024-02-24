// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.ShooterConstants;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel;

public class ShooterSubsystem extends SubsystemBase {

  CANSparkMax topShooter; //Also known as launch wheel.
  CANSparkMax bottomShooter; //Also known as feed wheel.

  /** Creates a new ExampleSubsystem. */
  public ShooterSubsystem() {

    //Initialize the motors.
    topShooter = new CANSparkMax(ShooterConstants.topShooter, CANSparkLowLevel.MotorType.kBrushed);
    bottomShooter = new CANSparkMax(ShooterConstants.bottomShooter, CANSparkLowLevel.MotorType.kBrushed);

    topShooter.setSmartCurrentLimit(ShooterConstants.kLauncherCurrentLimit);
    bottomShooter.setSmartCurrentLimit(ShooterConstants.kFeedCurrentLimit);
  }

  //Command built inside of a subsystem? Unheard of.
  public Command getIntakeCommand() {
    // The startEnd helper method takes a method to call when the command is initialized and one to
    // call when it ends
    return this.startEnd(
        // When the command is initialized, set the wheels to the intake speed values
        () -> {
          setFeedWheel(ShooterConstants.kIntakeFeederSpeed);
          setLaunchWheel(ShooterConstants.kIntakeLauncherSpeed);
        },
        // When the command stops, stop the wheels
        () -> {
          stop();
        });
  }

  // An accessor method to set the speed (technically the output percentage) of the launch wheel
  public void setLaunchWheel(double speed) {
    topShooter.set(speed);
  }

  // An accessor method to set the speed (technically the output percentage) of the feed wheel
  public void setFeedWheel(double speed) {
    bottomShooter.set(speed);
  }

  // A helper method to stop both wheels. You could skip having a method like this and call the
  // individual accessors with speed = 0 instead
  public void stop() {
    topShooter.set(0);
    bottomShooter.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
