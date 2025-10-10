package frc.robot.subsystems.scorer;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class PivotIOTalonFX implements PivotIO {
  // Define Motor/Encoder and set ids/channels
  private final TalonFX Pivot = new TalonFX(31);
  private final DutyCycleEncoder groundPivotEncoder = new DutyCycleEncoder(1);

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
}
