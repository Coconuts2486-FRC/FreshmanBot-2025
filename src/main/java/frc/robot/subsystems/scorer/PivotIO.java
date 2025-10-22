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

package frc.robot.subsystems.scorer;

import frc.robot.util.RBSIIO;

public interface PivotIO extends RBSIIO {
  public default void setPivotVelocity(double velocityInput) {}

  public default void setScorerVelocity(double velocityInput) {}

  public default void stopPivot() {}

  public default void stopScorer() {}

  public default void configPID(double kP, double kI, double kD) {}

  public default double groundPivotPose() {
    return 0.0;
  }

  public default void goUntilPosition(double position) {}
}
