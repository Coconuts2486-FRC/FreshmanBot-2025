package frc.robot.subsystems.dinosaur;

import frc.robot.util.RBSISubsystem;

public class dinosaur extends RBSISubsystem {
  private final dinosaurIO io;

  public dinosaur(dinosaurIO io) {
    this.io = io;
  }

  public void setVelocity(double velocity) {
    io.setVelocity(velocity);
  }
  public void stopVelocity() {
    io.stopVelocity();
  }
}
