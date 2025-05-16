// what?

package frc.robot.subsystems.vujh;

import frc.robot.util.RBSISubsystem;

public class Vujh extends RBSISubsystem {
  private final VujhIO io;

  public Vujh(VujhIO io) {
    this.io = io;
  }

  public void setVelocity(double velocityInput) {
    io.setVelocity(velocityInput);
  }
}
