package unit08.Practicum;

public class Arena {
    public static void battle(Fighter fighter1, Fighter fighter2) {
        while(fighter1.isConscious() && fighter2.isConscious()) {
            int damage1 = fighter1.Attack();
            fighter2.TakeDamage(damage1);
            if(fighter2.getHealth() < 0) {
                System.out.println(fighter2.getName() + " has " + 0 + "/" + fighter2.getMaxHealth() + " health left");
            } else {
                System.out.println(fighter2.getName() + " has " + fighter2.getHealth() + "/" + fighter2.getMaxHealth() + " health left");
            }

            int damage2 = fighter2.Attack();
            fighter1.TakeDamage(damage2);
            if(fighter1.getHealth() < 0) {
                System.out.println(fighter1.getName() + " has " + 0 + "/" + fighter1.getMaxHealth() + " health left");
            } else {
                System.out.println(fighter1.getName() + " has " + fighter1.getHealth() + "/" + fighter1.getMaxHealth() + " health left");
            }
        }
        if(!fighter1.isConscious() && !fighter2.isConscious()) {
            System.out.println("Its a draw!");
        } else if(fighter1.isConscious() && !fighter2.isConscious()) {
            System.out.println(fighter1);
        } else {
            System.out.println(fighter2);
        }
    }
    public static void main(String[] args) {
        Fighter Manio = new Manio();
        Fighter SamosA = new SamosA();
        battle(Manio, SamosA);
    }
}
