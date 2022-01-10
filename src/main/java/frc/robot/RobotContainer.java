package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ClimberSetPercentOutput;
import frc.robot.commands.DrivetrainArcadeDrive;
import frc.robot.commands.DrivetrainShiftingSetState;
import frc.robot.commands.IntakeBottomMotorSetPercentOutput;
import frc.robot.commands.IntakePistonsSetState;
import frc.robot.commands.IntakeTopMotorSetPercentOutput;
import frc.robot.commands.ShooterSetPercentOutput;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.DrivetrainShifting;
import frc.robot.subsystems.IntakeBottomMotor;
import frc.robot.subsystems.IntakePistons;
import frc.robot.subsystems.IntakeTopMotor;
import frc.robot.subsystems.Shooter;

public class RobotContainer {
    private final XboxController mXbox = new XboxController(0);
	private final Joystick mJoystick = new Joystick(1);

    private final Climber mClimber = new Climber();
	private final Drivetrain mDrivetrain = new Drivetrain();
	private final DrivetrainShifting mDrivetrainShifting = new DrivetrainShifting();
    private final IntakeTopMotor mIntakeTopMotor = new IntakeTopMotor();
    private final IntakePistons mIntakePistons = new IntakePistons();
    private final IntakeBottomMotor mIntakeBottomMotor = new IntakeBottomMotor();
    private final Shooter mShooter = new Shooter();

	public RobotContainer() {
        mClimber.setDefaultCommand(new ClimberSetPercentOutput(mClimber, 0.0));
		mDrivetrain.setDefaultCommand(new DrivetrainArcadeDrive(mDrivetrain, mXbox));
		mDrivetrainShifting.setDefaultCommand(new DrivetrainShiftingSetState(mDrivetrainShifting, true));
        mIntakeBottomMotor.setDefaultCommand(new IntakeBottomMotorSetPercentOutput(mIntakeBottomMotor, 0.0));
        mIntakePistons.setDefaultCommand(new IntakePistonsSetState(mIntakePistons, false));
        mIntakeTopMotor.setDefaultCommand(new IntakeTopMotorSetPercentOutput(mIntakeTopMotor, 0.0));
        mShooter.setDefaultCommand(new ShooterSetPercentOutput(mShooter, 0.0));

		configureButtonBindings();
	}

	private void configureButtonBindings() {
		JoystickButton xButtonA, xButtonB, xButtonX, xButtonY, xButtonLeftBumper, xButtonRightBumper,
				xButtonLeftStick, xButtonRightStick;
		JoystickButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8,
				jButton9, jButton10, jButton11, jButton12;

		xButtonA = new JoystickButton(mXbox, 1);
		xButtonB = new JoystickButton(mXbox, 2);
		xButtonX = new JoystickButton(mXbox, 3);
		xButtonY = new JoystickButton(mXbox, 4);
		xButtonLeftBumper = new JoystickButton(mXbox, 5);
		xButtonRightBumper = new JoystickButton(mXbox, 6);
		xButtonLeftStick = new JoystickButton(mXbox, 9);
		xButtonRightStick = new JoystickButton(mXbox, 10);

		jButton1 = new JoystickButton(mJoystick, 1);
		jButton2 = new JoystickButton(mJoystick, 2);
		jButton3 = new JoystickButton(mJoystick, 3);
		jButton4 = new JoystickButton(mJoystick, 4);
		jButton5 = new JoystickButton(mJoystick, 5);
		jButton6 = new JoystickButton(mJoystick, 6);
		jButton7 = new JoystickButton(mJoystick, 7);
		jButton8 = new JoystickButton(mJoystick, 8);
		jButton9 = new JoystickButton(mJoystick, 9);
		jButton10 = new JoystickButton(mJoystick, 10);
		jButton11 = new JoystickButton(mJoystick, 11);
		jButton12 = new JoystickButton(mJoystick, 12);

		xButtonA.whenPressed(new DrivetrainShiftingSetState(mDrivetrainShifting, false));
		xButtonB.whenPressed(new DrivetrainShiftingSetState(mDrivetrainShifting, true));
        xButtonY.whenPressed(new IntakePistonsSetState(mIntakePistons, true));
        xButtonX.whenPressed(new IntakePistonsSetState(mIntakePistons, false));

        jButton1.whileHeld(new ShooterSetPercentOutput(mShooter, 1.0));
        jButton2.whileHeld(new IntakeTopMotorSetPercentOutput(mIntakeTopMotor, 1.0));
        jButton3.whileHeld(new IntakeBottomMotorSetPercentOutput(mIntakeBottomMotor, 1.0));
        jButton4.whileHeld(new IntakeBottomMotorSetPercentOutput(mIntakeBottomMotor, -1.0));

        jButton7.whileHeld(new ClimberSetPercentOutput(mClimber, 1.0));
        jButton8.whileHeld(new ClimberSetPercentOutput(mClimber, -1.0));
	}

	public Command getAutonomousCommand() {
		return null;
	}
}
