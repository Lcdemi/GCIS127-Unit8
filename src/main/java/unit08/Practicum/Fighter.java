package unit08.Practicum;

public abstract class Fighter {
    private String name;
    private int health;

    public Fighter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract int Attack();

    public abstract void TakeDamage(int damage);

    public abstract int getMaxHealth();

    public boolean isConscious() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }  

    public void setHealth(int health) {
        this.health = health;
    }
}
