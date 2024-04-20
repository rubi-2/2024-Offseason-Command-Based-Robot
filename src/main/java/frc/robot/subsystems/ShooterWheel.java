 package frc.robot.subsystems;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterWheel extends SubsystemBase {

 private TalonFX shooter_wheel1;

 public ShooterWheel() {
    shooter_wheel1 = new TalonFX(1);

    // in init function, set slot 0 gains

    // copied over from CTRE Basic PID and Profiling

    var slot0Configs = new Slot0Configs();
    slot0Configs.kS = 0.05; // Add 0.05 V output to overcome static friction
    slot0Configs.kV = 0.12; // A velocity target of 1 rps results in 0.12 V output
    slot0Configs.kP = 0.11; // An error of 1 rps results in 0.11 V output
    slot0Configs.kI = 0; // no output for integrated error
    slot0Configs.kD = 0; // no output for error derivative

    //Tuning would need to occur, numbers are directly from CTRE example

    shooter_wheel1.getConfigurator().apply(slot0Configs);

}

  public void setShooterVelocity(double rps) {
    
    shooter_wheel1.setControl(new VelocityVoltage(rps)); 
    }

  public void stopShooter() {

    shooter_wheel1.setControl(new VoltageOut(0));

  }

  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

public Command exampleMethodCommand() {
  
    throw new UnsupportedOperationException("Unimplemented method 'exampleMethodCommand'");
}
}
