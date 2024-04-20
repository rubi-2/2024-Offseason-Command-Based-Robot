 package frc.robot.subsystems;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterWheel extends SubsystemBase {
  // create the subsystem

 private TalonFX shooterwheel1;

 public ShooterWheel() {
    shooterwheel1 = new TalonFX(1); //note to self: figure out what meaning the deviceId has if there's no settings file to link it to

    // in init function, set slot 0 gains

    // copied over from CTRE Basic PID and Profiling

    var slot0Configs = new Slot0Configs();
    slot0Configs.kS = 0.05; // Add 0.05 V output to overcome static friction
    slot0Configs.kV = 0.12; // A velocity target of 1 rps results in 0.12 V output
                            // Is this like a voltage compensation thing? should it be .11?
    slot0Configs.kP = 0.11; // An error of 1 rps results in 0.11 V output
    slot0Configs.kI = 0; // no output for integrated error
    slot0Configs.kD = 0; // no output for error derivative

    //note to self: figure out if slot0configs has other uses... im not sure what it means

    shooterwheel1.getConfigurator().apply(slot0Configs);
  }


  public void setVelocity() {
 
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
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
