// what?

package frc.robot.subsystems.scorer;

import frc.robot.util.RBSISubsystem;

public class Scorer extends RBSISubsystem {
  private final ScorerIO io;

  public Scorer(ScorerIO io) {
    this.io = io;
  }

  public void setVelocity(double velocityInput) {
    io.setVelocity(velocityInput);
  }

  public void stop() {
    io.setVelocity(0);
  }
}
