// Copyright (c) 2025 FRC 2486
// http://github.com/Coconuts2486-FRC
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.


// what?

package frc.robot.subsystems.scorer;

import frc.robot.util.RBSISubsystem;

public class Pivot extends RBSISubsystem {
  private final PivotIO io;

  public Pivot(PivotIO io) {
    this.io = io;
    io.configPID(1, 0, 0);
  }

  public void configPID(double kP, double kI, double kD) {
    io.configPID(kP, kI, kD);
  };

  public void setVelocity(double velocityInput) {
    io.setVelocity(velocityInput);
  }

  public void stop() {
    io.setVelocity(0);
  }

  public double groundPivotPose() {
      return 0.0;

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
