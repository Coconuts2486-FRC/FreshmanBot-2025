package frc.robot.subsystems.scorer;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;


public class ScorerIOSparkMAX implements ScorerIO {
  private final SparkMax scorer =
      new SparkMax(67, MotorType.kBrushless);

  public ScorerIOSparkMAX() {}

  @Override
  public void setVelocity(double velocity) {
    scorer.set(velocity);
  }

  @Override
  public void stop() {
    scorer.set(0);
  }
}
