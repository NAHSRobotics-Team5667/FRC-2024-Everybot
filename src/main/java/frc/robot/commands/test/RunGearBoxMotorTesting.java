package frc.robot.commands.test;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

import com.ctre.phoenix6.hardware.TalonFX;

public class RunGearBoxMotorTesting extends Command {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final ExampleSubsystem m_subsystem;

    private final TalonFX testMotor1 = new TalonFX(11);
    private final TalonFX testMotor2 = new TalonFX(10);
    private final TalonFX testMotor3 = new TalonFX(13);
    private final TalonFX testMotor4 = new TalonFX(16);

    /**
    * Creates a new ExampleCommand.
    *
    * @param subsystem The subsystem used by this command.
    */
    
    public RunGearBoxMotorTesting(ExampleSubsystem subsystem) {
        m_subsystem = subsystem;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        testMotor1.set(0.1);
        testMotor2.set(0.1);
        testMotor3.set(0.1);
        testMotor4.set(0.1);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {

    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        testMotor1.stopMotor();
        testMotor2.stopMotor();
        testMotor3.stopMotor();
        testMotor4.stopMotor();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
