package gradebook.model;

public class GradebookCategory {
    private String name;
    private int weight;

    public void setWeight(int w) {
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

}
