public class Puppy extends Toy3 {
    int puppyId;

    {
        puppyId = ++staticId;
    }

    public Puppy(String name, int frequency) {
        super(name, frequency);
    }

    @Override
    int getId() {
        return puppyId;
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
