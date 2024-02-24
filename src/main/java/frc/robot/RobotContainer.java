// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//Code imports.
import frc.robot.Constants.OperatorConstants;

//WPILib Package imports.
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {

  private final CommandXboxController driveController = new CommandXboxController(OperatorConstants.driveController);

  public RobotContainer() {

    configureBindings();
  }

  //Simple terms. This method assigns different commands to different operations to the controls.
  private void configureBindings() {
    //TODO: Configure trigger bindings.
  }
}
