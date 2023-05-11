public class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy moved !!!");
    }
    public void move(int step) {
        System.out.println("Enemy has moved "+step);
    }

}
