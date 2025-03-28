import Factory.Hero;
import Factory.HeroCreator;

public class Main {
    public static void main(String[] args) {
        //Theme based On Marvel Rivals Game

        Hero myHero = HeroCreator.getHeroInstance("Namor",250, "Duelist");
        System.out.println(myHero);

        Hero myHeroVanguard = HeroCreator.getVanguardInstance("The Thing",900);
        System.out.println(myHeroVanguard);

        Integer lifepoints = myHeroVanguard.getHealth();
        System.out.println(lifepoints);
    }
}