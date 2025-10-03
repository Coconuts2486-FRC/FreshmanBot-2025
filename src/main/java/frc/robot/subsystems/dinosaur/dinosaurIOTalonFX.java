package frc.robot.subsystems.dinosaur;

import com.ctre.phoenix6.hardware.TalonFX;

public class dinosaurIOTalonFX implements dinosaurIO {

  private final TalonFX bluey = new TalonFX(30);

  public dinosaurIOTalonFX() {}

  @Override
  public void setVelocity(double velocity) {
    bluey.set(velocity);
  }
  @Override
  public void stopVelocity(){
    bluey.stopMotor();
  }
}
