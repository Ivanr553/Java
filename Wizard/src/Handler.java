
import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
    
    private boolean up = false, right = false, left = false, down = false;
    
    LinkedList<GameObject> object = new LinkedList<GameObject>();
    
    public void tick() {
        for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            
            tempObject.tick();
        }
    }
    
    public void render(Graphics g) {
         for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            
            tempObject.render(g);
        }
    }
    
    public void addObject(GameObject tempObject) {
        object.add(tempObject);
    }
    
    public void removeObject(GameObject tempObject) {
        object.remove(tempObject);
    }

    public boolean isUp() {
        return up;
    }
    
    public boolean isDown() {
        return down;
    }
    
    public boolean isLeft() {
        return left;
    }
    
    public boolean isRight() {
        return right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setRight(boolean right) {
        this.right = right;
    }
}
