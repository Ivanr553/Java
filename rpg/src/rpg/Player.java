
package rpg;

public class Player {
    
    int pHealth, pAttack, pDefense;
    boolean isDefending;
    
    public Player(int pHealth, int pAttack, int pDefense, boolean isDefending) {
        this.pHealth = pHealth;
        this.pAttack = pAttack;
        this.pDefense = pDefense;
        this.isDefending = isDefending;
    }
    
    public int attackAction(int pAttack) {
        int attack = pAttack / 10;
        int modifier = (int) (Math.random() * 5);
        return attack + modifier;
    }
    
    public void takeDamage(int damage) {
        this.pHealth -= damage;
    }
    
    public void setHealth(int pHealth) {
        this.pHealth = pHealth;
    }
    
    public int getHealth() {
        return pHealth;
    }
    
    public void setAttack(int pAttack) {
        this.pAttack = pAttack;
    }
    
    public int getAttack() {
        return pAttack;
    }
    
    public void setDefense(int pDefense) {
        this.pDefense = pDefense;
    }
    
    public int getDefense() {
        return pDefense;
    }
    
    public void setDefending(boolean isDefending) {
        this.isDefending = isDefending;
    }
    
    public boolean getDefending() {
        return isDefending;
    }
    
}