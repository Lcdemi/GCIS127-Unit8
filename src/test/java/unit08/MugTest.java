package unit08;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MugTest {
    @Test
    public void constructor() {
        // setup
        double size = 24.5;
        String color = "purple";
        Material material = Material.CERAMIC;
        String phrase = "Mondays, am I right?";

        // invoke
        Mug mug = new Mug(size, color, material, phrase);

        // analyze
        assertEquals(size, mug.getSize(), 0.0d);
        assertEquals(color, mug.getColor());
        assertEquals(0.0d, mug.getFillLevel());
        assertEquals(material, mug.getMaterial());
        assertEquals(phrase, mug.getPhrase());
    }

    @Test
    public void fillLevelTest() {
        // setup
        double size = 24.5;
        String color = "purple";
        Material material = Material.CERAMIC;
        String phrase = "Mondays, am I right?";

        // invoke
        Mug mug = new Mug(size, color, material, phrase);
        mug.fill(8);

        // analyze
        assertEquals(8, mug.getFillLevel());
    }

    @Test
    public void drainTest() {
        // setup
        double size = 24.5;
        String color = "purple";
        Material material = Material.CERAMIC;
        String phrase = "Mondays, am I right?";

        // invoke
        Mug mug = new Mug(size, color, material, phrase);
        mug.fill(8);
        mug.drain(8);

        // analyze
        assertEquals(0, mug.getFillLevel());
    }
}
