package Factory.HeroClasses;

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Strategist{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}

