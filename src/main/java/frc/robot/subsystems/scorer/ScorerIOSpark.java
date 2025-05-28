// stuff is here

package frc.robot.subsystems.scorer;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class ScorerIOSpark implements ScorerIO {
  private final SparkMax scorerSparkMax = new SparkMax(21, MotorType.kBrushless);

  public ScorerIOSpark() {}

  @Override
  public void setVelocity(double velocityInput) {
    System.out.println("This is the requested velocity: " + velocityInput);
    scorerSparkMax.setVoltage(velocityInput);
  }
}
