package Factory;

public class Strategist extends Hero {
    private String name = " ";
    private Integer health = 0;

    protected Strategist(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String action() {
        return "I'm " + this.name + " and I healed!";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Strategist{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}