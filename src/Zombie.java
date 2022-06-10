public class Zombie extends Monster {
    //To Do
    public Zombie(String name) {
        super(name+" the Zombie", 5);
    }

    public void attack() {
        super.attack();
        System.out.print("Raaaauuughhhh ");
    }
}