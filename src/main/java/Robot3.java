public class Robot3 extends Toy3 {
    int robotId;

    {
        robotId = ++staticId;
    }

    public Robot3(String name, int frequency) {
        super(name, frequency);
    }

    @Override
    int getId() {
        return robotId;
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
