package unit08.Practicum;
import java.util.Random;

public class Manio extends Fighter {
    private static final int maxHealth = 100;

    public Manio() {
        super("Manio", maxHealth);
    }

    @Override
    public int Attack() {
        Random RNG = new Random();
        int randomNum = RNG.nextInt(25, 51);
        System.out.println("Manio uses a jump attack that hits for " + randomNum + " damage!");
        return randomNum;
    }

    @Override
    public void TakeDamage(int damage) {
        Random Dodge = new Random();
        int randomDodgeChance = Dodge.nextInt(1, 5);
        if(randomDodgeChance == 1) {
            System.out.println("Manio dodges the attack and takes no damage!");
        } else {
            System.out.println("Manio takes " + damage + " damage");
            setHealth(getHealth() - damage);
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public String toString() {
        return "Manio wins!";
    }
}
