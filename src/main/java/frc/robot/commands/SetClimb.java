package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimbSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

/**
 * This command should raise the climb as well as drop the climb with a single
 * button press.
 * 
 */
public class SetClimb extends Command {

    public ClimbSubsystem climb;

    /** Creates a new climb command. */
    public SetClimb(ClimbSubsystem climb) {
        // save the launcher system internally
        this.climb = climb;

        // indicate that this command requires the launcher system
        addRequirements(climb);
    }

    // Called when command is initiated/first scheduled
    @Override
    public void initialize() {
        climb.setClimbSpeed(0);
    }

    // Called when scheduler runs while the command is scheduled
    @Override
    public void execute() {
        climb.setClimbSpeed(-0.1);
    }

    // Called when the command is interruped or ended
    @Override
    public void end(boolean interrupted) {

    }

    // Called so it should return true when the command will end
    @Override
    public boolean isFinished() {
        return false;
    }
}