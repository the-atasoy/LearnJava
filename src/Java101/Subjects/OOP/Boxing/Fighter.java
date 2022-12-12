package Java101.Subjects.OOP.Boxing;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " damaged.");

        if (foe.dodge >= this.damage) {
            System.out.println(foe.name + " protected.");
            return foe.health;
        }

        if (foe.health - this.damage <= 0)
            return 0;

        return foe.health - this.damage;
    }


}
