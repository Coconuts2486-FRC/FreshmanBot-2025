package frc.robot.subsystems.scorer;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class PivotIOTalonFX implements PivotIO {
  // Define Motor/Encoder and set ids/channels
  private final TalonFX Pivot = new TalonFX(31);
  private final DutyCycleEncoder groundPivotEncoder = new DutyCycleEncoder(1);
  private final PIDController pid = new PIDController(4, 0, .5);

  // Motor Commands
  @Override
  public void setVelocity(double velocity) {
    Pivot.set(velocity);
  }

  @Override
  public void stop() {
    Pivot.set(0);
  }

  // Encoder Commands
  @Override
  public double groundPivotPose() {
    return groundPivotEncoder.get();
  }

  // PID (pain, incineration, and destruction)

  @Override
  public void configPID(double kP, double kI, double kD) {
    Slot0Configs pid = new Slot0Configs();
    pid.withKP(kP);
    pid.withKI(kI);
    pid.withKD(kD);
    Pivot.getConfigurator().apply(pid);
  }
}
