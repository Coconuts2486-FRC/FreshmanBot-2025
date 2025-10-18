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

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;

public class PivotIOSparkMAX implements PivotIO {
  // Define Motor/Encoder and set ids/channels
  private final SparkMax Pivot = new SparkMax(20, MotorType.kBrushless);
  private SparkMaxConfig config = new SparkMaxConfig();

  private final RelativeEncoder groundPivotEncoder = Pivot.getAlternateEncoder();

  // Motor Commands
  @Override
  public void setVelocity(double velocity) {
    Pivot.set(velocity);
  }

  @Override
  public void stop() {
    Pivot.set(0);
  }

  // Encoder Commands
  @Override
  public double groundPivotPose() {
    return groundPivotEncoder.getPosition();
  }

  // PID (pain, incineration, and destruction)

  @Override
  public void configPID(double kP, double kI, double kD) {
    // Set PID gains
    config.closedLoop.p(kP).i(kI).d(kD);
  }
}
