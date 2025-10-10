// what?

package frc.robot.subsystems.scorer;

import frc.robot.util.RBSISubsystem;

public class Pivot extends RBSISubsystem {
  private final PivotIO io;

  public Pivot(PivotIO io) {
    this.io = io;
    io.configPID(1, 0, 0);
  }

  public void setVelocity(double velocityInput) {
    io.setVelocity(velocityInput);
  }

  public void stop() {
    io.setVelocity(0);
  }

  ///////////////////////////////////////////
  /// Encoder Stuff
  public void goUntilPosition(double velocity, double position) {
    if (io.groundPivotPose() > position) {
      io.setVelocity(0);
    } else {
      io.setVelocity(velocity);
    }
  }
}
