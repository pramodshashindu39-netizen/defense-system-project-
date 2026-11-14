/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

/**
 *
 * @author ADMIN
 */
class DefenseUnit {
   
    private int soldierCount =0;
    private  int ammoCount = 0;
    private String position = "NOT IN POSITION";
    
    public void setSoldierCount(int soldierCount){
        this.soldierCount=soldierCount;
    };
    
    public void setAmmoCount(int ammoCount){
        this.ammoCount=ammoCount;
    }
    
    public void setPosition(String position){
        this.position=position;
    }
    
    public int getSoldierCount(){
        return soldierCount;
    };
    
    public int getAmmoCount(){
        return ammoCount;
    }
    
    public String getPosition(){
        return position;
    }
    
    
}
