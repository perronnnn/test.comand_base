// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BasePilotable extends SubsystemBase {

  private final CANSparkMax sparkMaxDroit1 = new CANSparkMax(33,MotorType.kBrushless);
  private final CANSparkMax sparkMaxDroit2 = new CANSparkMax(32,MotorType.kBrushless);
  private final CANSparkMax sparkMaxGauche1 = new CANSparkMax(31,MotorType.kBrushless);
  private final CANSparkMax sparkMaxGauche2 = new CANSparkMax(30,MotorType.kBrushless);
  
  private final MotorControllerGroup motorControllerdroit = new MotorControllerGroup(sparkMaxDroit1,sparkMaxDroit2);
  private final MotorControllerGroup motorControllergauche = new MotorControllerGroup(sparkMaxGauche1,sparkMaxGauche2);
  private final DifferentialDrive differentialDrive = new DifferentialDrive(motorControllerdroit, motorControllergauche); 
  /** Creates a new BasePilotable. */
  public BasePilotable() {

    sparkMaxDroit2.setInverted(true);
    sparkMaxDroit1.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void conduire(double x, double z){
    differentialDrive.arcadeDrive(x, -z);

  }
  
}


