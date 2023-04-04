import java.util.List;

public class RandomSuccessfullyToy {
    public Toys chooseOnWeight(List<Toys> toys) {
        double completeWeight = 0.0;
        for (Toys toy : toys)
            completeWeight += toy.getSuccessRate();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toys toy : toys) {
            countWeight += toy.getSuccessRate();
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }
}