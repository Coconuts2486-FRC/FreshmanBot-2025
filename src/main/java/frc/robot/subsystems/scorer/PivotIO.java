package frc.robot.subsystems.scorer;

import frc.robot.util.RBSIIO;

public interface PivotIO extends RBSIIO {
  public default void setVelocity(double velocityInput) {}

  public default void configPID(double kP, double kI, double kD) {}

  public default double groundPivotPose() {
    return 0.0;
  }
}
