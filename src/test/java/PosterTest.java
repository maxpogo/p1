import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;


public class PosterTest {
    @Test
    public void findAll() {
        Poster manager = new Poster();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");


        String[] expected = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5() {
        Poster manager = new Poster(5);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {"Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", //"Sixth", //"Fifth", //"Fourth", //"Third", //"Second", //"First"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast11() {
        Poster manager = new Poster(11);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {"Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast0() {
        Poster manager = new Poster(0);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindLast(){
        Poster manager = new Poster();
        manager.add("First");

        String[] expected = {"First"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }

}


