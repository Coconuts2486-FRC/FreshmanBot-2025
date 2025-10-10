package frc.robot.subsystems.scorer;

import frc.robot.util.RBSIIO;

public interface PivotIO extends RBSIIO {
  public default void setVelocity(double velocityInput) {}

  public default double groundPivotPose() {
    return 0.0;
  }
}
