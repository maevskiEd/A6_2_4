public class Monster {
    private String name;
    private int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }

    public void growl() {
        System.out.println(name + " growled");
    }

    public void attack() {
        System.out.println("Monster " + name + " attacked with damage 5");
    }
}
