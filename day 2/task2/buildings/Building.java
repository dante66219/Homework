package task2.buildings;

public abstract class Building {

    private String name;

    public String getName() {
        return name;
    }

    public abstract void display();

    public void setName(String name) {
        this.name = name;
    }

    public Building(String name){
        this.name = name;
    }


}
