// what?

package frc.robot.subsystems.ground_intake;

import frc.robot.util.RBSISubsystem;

public class Intake extends RBSISubsystem {
  private final IntakeIO io;

  public Intake(IntakeIO io) {
    this.io = io;
  }

  public void setIntakeVelocity(double velocityInput) {
    io.setIntakeVelocity(velocityInput);
  }

  public void stop() {
    io.setIntakeVelocity(0);
  }
}
