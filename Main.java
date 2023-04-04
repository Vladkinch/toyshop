import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Toys> toysList;
        toysList = Inputs.getWarehouseInputToy(); // генерируем лист с игрушками



        StoreToy toyStore = new StoreToy(toysList);
        for (int i = 0; i < toysList.size(); i++) {
            toyStore.generateSaveLottery();
        }

        System.out.println("Файл Toys.txt записан");

    }
}