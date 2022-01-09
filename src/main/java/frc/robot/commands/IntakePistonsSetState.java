package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakePistons;

public class IntakePistonsSetState extends CommandBase {
    private final IntakePistons mIntakePistons;
    private boolean mExtended;

    public IntakePistonsSetState(IntakePistons intakePistons, boolean extended) {
        mIntakePistons = intakePistons;
        mExtended = extended;
        addRequirements(mIntakePistons);
    }

    @Override
    public void initialize() {
        mIntakePistons.setPistonsState(mExtended);
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
