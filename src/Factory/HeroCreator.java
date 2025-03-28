package Factory;

public class HeroCreator {

    public static Hero getHeroInstance(String name, Integer health, String className) {
        Hero returnedHero = HeroFactory.createAHero(name, health, className);
        return returnedHero;
    }

    public static Hero getVanguardInstance(String name, Integer health) {
        return new Vanguard(name, health);
    }

    public static Hero getDuelistInstance(String name, Integer health) {
        return new Duelist(name, health);
    }

    public static Hero getStrategistInstance(String name, Integer health) {
        return new Strategist(name, health);
    }
}