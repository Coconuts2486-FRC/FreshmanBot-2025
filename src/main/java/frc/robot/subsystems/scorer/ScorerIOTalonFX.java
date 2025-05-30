package frc.robot.subsystems.scorer;

import com.ctre.phoenix6.hardware.TalonFX;

public class ScorerIOTalonFX implements ScorerIO {
  private final TalonFX scorer = new TalonFX(30);

  public ScorerIOTalonFX() {}

  @Override
  public void setVelocity(double velocity) {
    scorer.set(velocity);
  }

  @Override
  public void stop() {
    scorer.set(0);
  }
}
