package frc.robot.subsystems.scorer;

import frc.robot.util.RBSIIO;

public interface ScorerIO extends RBSIIO {
  public default void setVelocity(double velocityInput) {}
}
