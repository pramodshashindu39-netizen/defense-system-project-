/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

/**
 *
 * @author ADMIN
 */
public interface DefenseUnitsObserver {
  
    public void showmsgs(String msg);
    public void setText(String status);
    public int getSoldierCountInfo();
    public int getAmmoCountInfo();
    public String isPositionInfo();
    public void strangthLevel(int value);
}
