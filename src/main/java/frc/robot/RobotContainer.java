// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//Code imports.
import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.SwerveSubsystem;

import java.io.File;

import com.pathplanner.lib.auto.AutoBuilder;
import com.pathplanner.lib.commands.PathPlannerAuto;
import com.pathplanner.lib.path.PathPlannerPath;

//WPILib Package imports.
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.math.MathUtil;


public class RobotContainer {


  // Subsystem Variables.
  SwerveSubsystem swerveDrive;

  private static final CommandXboxController driveController = new CommandXboxController(OperatorConstants.driveController);

  public RobotContainer() {

    // ================================================
    // ================= SWERVE DRIVE =================

    SwerveSubsystem.initialize(new File(Filesystem.getDeployDirectory(),"swerve"));
    swerveDrive = SwerveSubsystem.getInstance();

    // Real drive command
        Command driveFieldOrientedAnglularVelocity = swerveDrive.driveCommand(
                () -> MathUtil.applyDeadband(driveController.getLeftY(),
                        OperatorConstants.LEFT_Y_DEADBAND), // X direction
                // is front
                () -> MathUtil.applyDeadband(driveController.getLeftX(),
                        OperatorConstants.LEFT_X_DEADBAND), // Y direction
                // is left
                () -> driveController.getRightX()); // right stick horizontal value

        // Simulation drive command
        Command driveFieldOrientedAnglularVelocitySim = swerveDrive.simDriveCommand(
                () -> MathUtil.applyDeadband(driveController.getLeftY(),
                        OperatorConstants.LEFT_Y_DEADBAND), // X direction
                // is front
                () -> MathUtil.applyDeadband(driveController.getLeftX(),
                        OperatorConstants.LEFT_X_DEADBAND), // Y direction
                // is left
                () -> driveController.getRightX()); // right stick horizontal value

        // Sets default DT command to the real command when robot is IRL
        // Sets default DT command to the sim command when robot is simulated

        swerveDrive.setDefaultCommand(!RobotBase.isSimulation() ? driveFieldOrientedAnglularVelocity : driveFieldOrientedAnglularVelocitySim);

    configureBindings();
  }

  public static CommandXboxController getDriverController() {
    return driveController;
  }

  //Simple terms. This method assigns different commands to different operations to the controls.
  private void configureBindings() {
    //TODO: Configure trigger bindings.
  }

  public Command getAutonomousCommand() {
        //
        // An example command will be run in autonomous
        //return null;
 
        return swerveDrive.getAutonomousCommand("Test", true);
    }
}
