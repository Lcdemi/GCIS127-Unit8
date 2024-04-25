package unit08.Practicum;
import java.util.Random;

public class SamosA extends Fighter {
    private static final int maxHealth = 200;

    public SamosA() {
        super("SamosA", maxHealth);
    }

    @Override
    public int Attack() {
        Random RNG = new Random();
        int randomNum = RNG.nextInt(1, 5);
        if(randomNum == 1) {
            System.out.println("SamosA attacks with his missiles for 75 damage!");
            return 75;
        } else {
            System.out.println("SamosA attacks with his arm cannon for 40 damage!");
            return 40;
        }
    }

    @Override
    public void TakeDamage(int damage) {
        System.out.println("SamosA takes " + damage + " damage");
        setHealth(getHealth() - damage);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public String toString() {
        return "SamosA wins!";
    }
}
