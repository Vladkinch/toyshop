import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputs {

    public static Scanner iScanner = new Scanner(System.in);

    // Формируем склад
    public static List<Toys> getWarehouseInputToy(){
        Toys toy1 = new Toys(0, "Мишка", 25);
        Toys toy2 = new Toys(1, "Ракета", 40);
        Toys toy3 = new Toys(2, "Бомбочка", 3);
        Toys toy4 = new Toys(3, "Кукла", 65);
        Toys toy5 = new Toys(4, "Машинка", 25);

        List<Toys> toysList = new ArrayList<>();
        toysList.add(toy5);
        toysList.add(toy4);
        toysList.add(toy3);
        toysList.add(toy2);
        toysList.add(toy1);

        System.out.println("Список игрушек на складе " + toysList.toString());
        System.out.println("Используем его?" +
                "\n1 - Да" +
                "\n2 - Нет, введём сами");
        String menuItem = iScanner.nextLine();
        if(menuItem.equals("1")){
            System.out.println("ok");
        } else{
            toysList.clear();

            //добавляем игрушки в коллекцию в ручную
            getUserInputToy(toysList);


        }

        return toysList;
    }


    public static void getUserInputToy(List<Toys> toysList){
        String subMenuItem = "";
        while(!subMenuItem.equals("2")) {
            int id = 0;
            System.out.println("Вы находитесь в меню, ввод новой игрушки");
            System.out.println("Укажите имя: ");
            String name = iScanner.nextLine();
            System.out.println("Укажите SuccessRate (число): ");
            int successRate = iScanner.nextInt();

            Toys toy = new Toys(id, name, successRate);
            toysList.add(toy);


            subMenuItem = subMenuItemFunc();
            subMenuItem = iScanner.nextLine();

            if (subMenuItem.equals("1")) {
                id++;
            } else if (subMenuItem.equals("2")) {
                System.out.println("Отлично! Вот список " + toysList.toString());
            }
        }
    }

    public static String subMenuItemFunc(){
        System.out.println("Добавить ещё одну игрушку" +
                "\n1 - Да" +
                "\n2 - Нет, хватит");

        String subMenuItem = "";
        subMenuItem = iScanner.nextLine();
        return subMenuItem;
    }

}