
package rpg;

public class Boss {
      
    int bHealth, bAttack, bDefense;
    boolean isDefending, attackPrepared;
    
    public Boss(int bHealth, int bAttack, int bDefense, boolean isDefending, boolean attackPrepared) {
        //Generation of Boss object
        this.bHealth = bHealth;
        this.bAttack = bAttack;
        this.bDefense = bDefense;
        this.isDefending = isDefending;
        this.attackPrepared = attackPrepared;
    }
    
    public int bossAttack(int bAttack, boolean getPrepared, boolean playerDefending) {
        //Generating damage for attack
        int modifier = (int) (Math.random() * 10);
        int attack = bAttack / 10;
        int damage = attack + modifier;
        
        //Checking if boss prepared this attack
        if(getPrepared == true) {
            damage = damage *2;
        }
        
        //Checking if player is defending this attack
        if(playerDefending == true) {
            return damage / 4;
        }
        
        return attack + modifier;
    }
    
    //Taking damage
    public void takeDamage(int damage) {
        this.bHealth -= damage;
    }
    
    //Preparation get/set
    public void setPrepared(boolean attackPrepared) {
        this.attackPrepared = attackPrepared;
    }    
    public boolean getPrepared() {
        return attackPrepared;
    }
    
    //Health get/set
    public void setHealth(int bHealth) {
        this.bHealth = bHealth;
    }    
    public int getHealth() {
        return bHealth;
    }
    
    //Attack get/set
    public void setAttack(int bAttack) {
        this.bAttack = bAttack;
    }    
    public int getAttack() {
        return bAttack;
    }
    
    //Defense get/set
    public void setDefense(int bDefense) {
        this.bDefense = bDefense;
    }    
    public int getDefense() {
        return bDefense;
    }
    
    //Defending status get/set
    public void setDefending(boolean isDefending) {
        this.isDefending = isDefending;
    }    
    public boolean getDefending() {
        return isDefending;
    }
    
}
