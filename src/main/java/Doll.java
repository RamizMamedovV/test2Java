public class Doll extends Toy3 {
    int dollId;

    {
        dollId = ++staticId;
    }

    public Doll(String name, int frequency) {
        super(name, frequency);
    }

    @Override
    int getId() {
        return dollId;
    }

    @Override
    int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Toy3 o) {
        return Integer.compare(o.getFrequency(),frequency);
    }
}
