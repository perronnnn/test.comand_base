// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BasePilotable;

public class Conduire extends CommandBase {
  /** Creates a new Conduire. */

BasePilotable basePilotable;
DoubleSupplier avancer;
DoubleSupplier tourner;


  public Conduire(BasePilotable basePilotable, DoubleSupplier avancer, DoubleSupplier tourner) {

    this.basePilotable = basePilotable;
    this.avancer = avancer;
    this.tourner = tourner;
addRequirements(basePilotable);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    basePilotable.conduire(avancer.getAsDouble(), tourner.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
