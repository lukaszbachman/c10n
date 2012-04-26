package c10n;

/**
 * @author Lukasz Bachman
 */
public class NameAndBundle<String, T> {

    private String name;

    private T type;

    public NameAndBundle(String name, T type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public T getType() {
        return type;
    }
}
