// stuff is here

package frc.robot.subsystems.vujh;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class VujhIOSpark implements VujhIO {
  private final SparkMax vujhSparkMax = new SparkMax(21, MotorType.kBrushless);

  public VujhIOSpark() {}

  @Override
  public void setVelocity(double velocityInput) {
    System.out.println("This is the requested velocity: " + velocityInput);
    vujhSparkMax.setVoltage(velocityInput);
  }
}
