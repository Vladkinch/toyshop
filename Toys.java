public class Toys {
    int id;
    String name;
    int successRate;




    public Toys(int id, String name, int successRate) {
        this.id = id;
        this.name = name;
        this.successRate = successRate;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public int getSuccessRate() {return successRate;}

    @Override
    public String toString(){
        return String.format("id: %d | %s | вес: %d", id, name, successRate);
    }
}