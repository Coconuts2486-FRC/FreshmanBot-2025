package frc.robot.subsystems.dinosaur;

import frc.robot.util.RBSIIO;

public interface dinosaurIO extends RBSIIO{


  public default void setVelocity(double velocity){}
  
}
