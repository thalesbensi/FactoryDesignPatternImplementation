package Factory.HeroClasses;

public class Duelist extends Hero {
    private String name;
    private Integer health;

    protected Duelist(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String action() {
        return "I'm " + name + " and I deal damage!";
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
        return "Duelist{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
