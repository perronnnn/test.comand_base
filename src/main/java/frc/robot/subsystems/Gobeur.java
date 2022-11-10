// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gobeur extends SubsystemBase {

  private DoubleSolenoid tiroir = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,4, 5);
  private CANSparkMax rouleau = new CANSparkMax(26, MotorType.kBrushless);

  /** Creates a new Gobeur. */
  public Gobeur() {
    rouleau.setInverted(false);
    
  }
public void tiroirClose(){
   tiroir.set(Value.kForward);
  }
  public void tiroirOut(){
    tiroir.set(Value.kReverse);
  }
  public void moteurStop(){
    rouleau.set(0.0);
  }
  public void moteurGob(){
    rouleau.set(1.0);
  }
  public void moteurpanic(){
    rouleau.set(-1.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}  
