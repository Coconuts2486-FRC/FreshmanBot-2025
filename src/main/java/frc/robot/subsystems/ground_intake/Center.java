// what?

package frc.robot.subsystems.ground_intake;

import frc.robot.util.RBSISubsystem;

public class Center extends RBSISubsystem {
  private final CenterIO io;

  public Center(CenterIO io) {
    this.io = io;
  }

  public void setCenterVelocity(double velocityInput) {
    io.setCenterVelocity(velocityInput);
  }

  public void stop() {
    io.setCenterVelocity(0);
  }
}
