package frc.robot.subsystems.ground_intake;

import com.ctre.phoenix6.hardware.TalonFX;

public class IntakeIOTalonFX implements IntakeIO {
  private final TalonFX Intake = new TalonFX(30);

  public IntakeIOTalonFX() {}

  @Override
  public void setIntakeVelocity(double velocity) {
    Intake.set(velocity);
  }

  @Override
  public void stop() {
    Intake.set(0);
  }
}
