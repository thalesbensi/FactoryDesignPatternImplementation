package Factory.HeroClasses;

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
        return "Vanguard{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}

