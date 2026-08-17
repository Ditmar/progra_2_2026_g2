import com.game.Damage;
import com.game.Hero;

public class App {
    public static void main(String[] args) throws Exception {
        Hero hero = new Hero(100.0, 10.0);
        for (Integer i = 0; i < 100; i++ ) {
            Damage damage = hero.generateDamage();
            System.out.println(" Seek: " + damage.getGenRandom() + " Damage " + damage.getDamage());
        }
    }
}
