package Factory;

public final class HeroFactory {

    public static Hero createAHero(String name, Integer health, String className) {
       return switch (className.toLowerCase()) {
            case "vanguard" -> new Vanguard(name, health);
            case "duelist" -> new Duelist(name, health);
            case "strategist" -> new Strategist(name, health);
            default -> throw new IllegalArgumentException("No such class: " + className + "on the game, maybe next patch!");
        };
    }
}