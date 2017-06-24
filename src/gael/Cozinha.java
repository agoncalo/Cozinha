package gael;

/**
 * Created by AntonioFilho on 24/06/17.
 */
public class Cozinha {
    private static Cozinha ourInstance = new Cozinha();

    public static Cozinha getInstance() {
        return ourInstance;
    }

    private Cozinha() {
    }
}
