public class Bobcat implements Tradable, Drivable {
    private int strength; 
    private int maxSpeed
  
    public void Bobcat(int num1, int num2) {
        this.strength = num1;
        this.maxSpeed = num2;
    } 
  
    @Override 
    public int getPrice() {
        return this.strength * 10;
    } 
  
    @Override
    public void upgradeSpeed() { 
        this.maxSpeed += 5; 
    }
    
    @Override 
    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    } 
  
    @Override 
    public int getMaxSpeed() {
        return this.maxSpeed; 
    }
    
}
