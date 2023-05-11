
public class Hero extends Character {
    @Override
    public void move() {
        System.out.println("Hero moved");
    }

    public void move(String direction) {
        System.out.println("Hero has moved to the "+direction);
    }
    
    
    
}