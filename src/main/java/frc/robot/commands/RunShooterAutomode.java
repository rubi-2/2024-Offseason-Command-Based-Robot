package frc.robot.commands;

import frc.robot.subsystems.ShooterWheel;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class RunShooterAutomode {

  /** static factory for the autonomous command. */
  public static Command shooterAuto(ShooterWheel subsystem) {
    return Commands.sequence(
      new ShootCommand(subsystem, 20).withTimeout(5),
      Commands.waitSeconds(5),
      new ShootCommand(subsystem, 20).withTimeout(5)
      );

  }

  private RunShooterAutomode() {

    throw new UnsupportedOperationException("This is a utility class!");

  }
}