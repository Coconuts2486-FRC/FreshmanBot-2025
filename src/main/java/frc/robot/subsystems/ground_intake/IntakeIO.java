package frc.robot.subsystems.ground_intake;

import frc.robot.util.RBSIIO;

public interface IntakeIO extends RBSIIO {
  public default void setIntakeVelocity(double velocityInput) {}
}
