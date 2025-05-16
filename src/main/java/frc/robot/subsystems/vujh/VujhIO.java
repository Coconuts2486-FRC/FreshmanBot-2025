package frc.robot.subsystems.vujh;

import frc.robot.util.RBSIIO;

public interface VujhIO extends RBSIIO {
  public default void setVelocity(double velocityInput) {}
}
