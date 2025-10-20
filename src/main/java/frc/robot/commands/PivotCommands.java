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

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.scorer.Pivot;

public class PivotCommands extends Command {


  private final Pivot pivot;
  private final double velocity;
  private final double position;

  public PivotCommands(Pivot pivot, double velocity, double position) {
    this.velocity = velocity;
    this.pivot = pivot;
    this.position = position;
    addRequirements(pivot);
  }

  public static Command goUntilPosition(
    Pivot pivot,Double velocity,int position
  ) { return Commands.run(() -> pivot.goUntilPosition(velocity, position));}

  @Override
  public void initialize() {

    pivot.configPID(position, velocity, position);
    pivot.setPivotVelocity(velocity);
    pivot.goUntilPosition(velocity, position);
    pivot.setScorerVelocity(velocity);
    pivot.stopPivot();
    pivot.stopScorer();
  }
    ;


  @Override
  public void execute() {

    pivot.setPivotVelocity(velocity);
    pivot.goUntilPosition(velocity, position);
    pivot.setScorerVelocity(velocity);
    pivot.stopPivot();
    pivot.stopScorer();
  }

  @Override
  public void end(boolean interrupted) {
    pivot.stopPivot();
    pivot.stopScorer();
  }

}
