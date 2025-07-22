package frc.robot.subsystems.ground_intake;

import com.ctre.phoenix6.hardware.TalonFX;

public class CenterIOTalonFX implements CenterIO {
  private final TalonFX Center = new TalonFX(31);

  public CenterIOTalonFX() {}

  @Override
  public void setCenterVelocity(double velocity) {
    Center.set(velocity);
  }

  @Override
  public void stop() {
    Center.set(0);
  }
}
