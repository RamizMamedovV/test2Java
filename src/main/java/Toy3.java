public abstract class Toy3 implements Comparable<Toy3>{

    static int staticId;
    String name;
    int frequency;

    static {
        staticId = 0;
    }
    abstract int getId();

    public String getName() {
        return name;
    }

    abstract int getFrequency();

    public Toy3(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, id: %d", getName(), getId());
    }

}
