public class App {
    public static void main(String[] args) {
        System.out.println("Nama : Putri Torsia Aura P");
        System.out.println("NIM  : 225150601111014");
        System.out.println("");
        //Static polymorphism pada class Hero dan static polymorphism pada class Enemy
        Hero hero = new Hero();
        hero.move();
        hero.move("Right");
        System.out.println("");
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(5);
        System.out.println("");


        //Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character character = new Character();
        character.move();
        character = new Hero();
        character.move();
        character = new Enemy();
        character.move();
        character = new Witch();
        character.move();
        character = new Fighter();
        character.move();
        System.out.println("");

        

        //Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character ch = new Witch();
        ch.move();
        Character fg = (Fighter)ch;
        fg.move();
        
        
        

        
    }
}
