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

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.scorer.Scorer;

public class ScorerCommands extends Command {

  private final Scorer scorer;
  private final double velocity;

  public ScorerCommands(Scorer scorer, double velocity, double position) {
    this.scorer = scorer;
    this.velocity = velocity;
    addRequirements(scorer);
  }

  @Override
  public void initialize() {}
  ;

  @Override
  public void execute() {

    scorer.setVelocity(velocity);
  }

  @Override
  public void end(boolean interrupted) {
    scorer.stop();
  }
}
