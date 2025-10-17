package frc.robot.subsystems.scorer;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import frc.robot.Constants.CANandPowerPorts;

public class PivotIOSparkMAX implements PivotIO {
  // Define Motor/Encoder and set ids/channels
  private final SparkMax Pivot =
      new SparkMax(CANandPowerPorts.PIVOT.getDeviceNumber(), MotorType.kBrushless);
  private SparkMaxConfig config = new SparkMaxConfig();

  private final RelativeEncoder groundPivotEncoder = Pivot.getAlternateEncoder();

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
    return groundPivotEncoder.getPosition();
  }

  // PID (pain, incineration, and destruction)

  @Override
  public void configPID(double kP, double kI, double kD) {
    // Set PID gains
    config.closedLoop.p(kP).i(kI).d(kD);
  }
}
