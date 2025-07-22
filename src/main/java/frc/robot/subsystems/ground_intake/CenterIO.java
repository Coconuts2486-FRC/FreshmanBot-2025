package frc.robot.subsystems.ground_intake;

import frc.robot.util.RBSIIO;

public interface CenterIO extends RBSIIO {
  public default void setCenterVelocity(double velocityInput) {}
}
