package Factory;

public class Vanguard extends Hero {
    private String name;
    private Integer health;

    protected Vanguard(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String action() {
        return "I'm " + name + " and I tanked damage!";
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
        return "Vanguard{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}