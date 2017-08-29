
package rpg;

public class Player {
    
    int pHealth, pAttack, pDefense;
    boolean isDefending;
    
    public Player(int pHealth, int pAttack, int pDefense, boolean isDefending) {
        //Generation of Player object
        this.pHealth = pHealth;
        this.pAttack = pAttack;
        this.pDefense = pDefense;
        this.isDefending = isDefending;
    }
    
    //Main attack action for player
    public int attackAction(int pAttack, Boss boss, boolean bossDefending) {
        int attack = pAttack / 10;
        int modifier = (int) (Math.random() * 5);
        int damage = attack + modifier;
        
        //Checking if boss defended attack
        if(bossDefending == true) {
            return damage / 4;
        }
        
        return damage;
    }
    
    //Taking damage
    public void takeDamage(int damage) {
        this.pHealth -= damage;
    }
    
    
    //Health get/set
    public void setHealth(int pHealth) {
        this.pHealth = pHealth;
    }    
    public int getHealth() {
        return pHealth;
    }
    
    
    //Attack get/set
    public void setAttack(int pAttack) {
        this.pAttack = pAttack;
    }    
    public int getAttack() {
        return pAttack;
    }
    
    
    //Defense get/set
    public void setDefense(int pDefense) {
        this.pDefense = pDefense;
    }
    public int getDefense() {
        return pDefense;
    }
    
    
    //Defending status get/set
    public void setDefending(boolean isDefending) {
        this.isDefending = isDefending;
    }
    public boolean getDefending() {
        return isDefending;
    }
    
}