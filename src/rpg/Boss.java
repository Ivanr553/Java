
package rpg;

public class Boss {
      
    int bHealth, bAttack, bDefense;
    boolean isDefending;
    
    public Boss(int bHealth, int bAttack, int bDefense, boolean isDefending) {
        this.bHealth = bHealth;
        this.bAttack = bAttack;
        this.bDefense = bDefense;
        this.isDefending = isDefending;
    }
    
    public void takeDamage(int damage) {
        this.bHealth -= damage;
    }
    
    public void setHealth(int bHealth) {
        this.bHealth = bHealth;
    }
    
    public int getHealth() {
        return bHealth;
    }
    
    public void setAttack(int bAttack) {
        this.bAttack = bAttack;
    }
    
    public int getAttack() {
        return bAttack;
    }
    
    public void setDefense(int bDefense) {
        this.bDefense = bDefense;
    }
    
    public int getDefense() {
        return bDefense;
    }
    
    public void setDefending(boolean isDefending) {
        this.isDefending = isDefending;
    }
    
    public boolean getDefending() {
        return isDefending;
    }
    
}
