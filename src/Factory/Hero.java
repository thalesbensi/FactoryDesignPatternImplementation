package Factory;

public abstract class Hero {
    protected String name;
    protected Integer health;

    public abstract String action();

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
