public class Main {
    public static Toy3[] toysCreator(ToyModels madel, int frequency, int quantity) {
        Toy3[] toys = new Toy3[quantity];
        switch (madel) {
            case Doll -> {
                for (int i = 0; i < toys.length; i++) {
                    toys[i] = new Doll("Doll", frequency);
                }
            }
            case Puppy -> {
                for (int i = 0; i < toys.length; i++) {
                    toys[i] = new Puppy("Puppy", frequency);
                }
            }
            case Robot -> {
                for (int i = 0; i < toys.length; i++) {
                    toys[i] = new Robot3("Robot", frequency);
                }
            }
        }
        return toys;
    }

    public static void giveToys() {

    }

    public static void main(String[] args) {

        Toy3[] toysDoll = toysCreator(ToyModels.Doll, 2, 2);
        Toy3[] toysRobots = toysCreator(ToyModels.Robot, 6, 6);
        Toy3[] toysPuppy = toysCreator(ToyModels.Puppy, 2, 2);

        SlotMachine machine = new SlotMachine();
        machine.addToys(toysDoll);
        machine.addToys(toysPuppy);
        machine.addToys(toysRobots);

        for (int i = 0; i < 10; i++) {
            machine.playMachine();
        }

        machine.giveToys();
    }
}
