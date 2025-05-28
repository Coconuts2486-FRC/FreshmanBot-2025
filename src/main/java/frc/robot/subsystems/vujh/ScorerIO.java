package frc.robot.subsystems.vujh;

import frc.robot.util.RBSIIO;

public interface ScorerIO extends RBSIIO {
  public default void setVelocity(double velocityInput) {}
}
