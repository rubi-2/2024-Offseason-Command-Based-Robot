package frc.robot.commands;

import frc.robot.subsystems.ShooterWheel;
import edu.wpi.first.wpilibj2.command.Command;

public class ShootCommand extends Command {
  
  private final ShooterWheel shooter_wheel_subsystem;

  double velocity_;
  
  public ShootCommand(ShooterWheel subsystem, double velocity) {

    shooter_wheel_subsystem = subsystem;
    velocity_ = velocity; 

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    shooter_wheel_subsystem.setShooterVelocity(velocity_); 

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

   shooter_wheel_subsystem.stopShooter();

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}