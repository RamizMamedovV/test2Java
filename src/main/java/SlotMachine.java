import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SlotMachine {
    PriorityQueue<Toy3> toy3PriorityQueue;
    ArrayList<Toy3> toy3Queue;

    public SlotMachine() {
        toy3PriorityQueue = new PriorityQueue<>(10);
        toy3Queue = new ArrayList<>();
    }

    public void addToys(Toy3[] toys) {
        toy3PriorityQueue.addAll(Arrays.asList(toys));
    }

    public void playMachine() {
        System.out.println(toy3PriorityQueue.peek());
        addToys();
    }

    private void addToys() {
        toy3Queue.add(toy3PriorityQueue.poll());
    }

    public void giveToys() {
        try (FileWriter fileWriter = new FileWriter("toys.txt")) {
            for (int i = 0; i < 10; i++) {
                fileWriter.write(toy3Queue.get(i) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
