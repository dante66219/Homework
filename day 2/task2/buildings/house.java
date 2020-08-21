package task2.buildings;

public class house extends Building implements Residential{

    private validation res;

    private int area;
    private int cost;
    private int PricePerArea;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPricePerArea() {
        return PricePerArea;
    }

    public void setPricePerArea(int pricePerArea) {
        PricePerArea = pricePerArea;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    public house(String name, validation res, int area, int cost, int PricePerArea) {
        super(name);
        this.res = res;
        this.area = area;
        this.cost = cost;
        this.PricePerArea = area * cost;
    }

    @Override
    public validation showMeSomeId() {
        return res;
    }

    @Override
    public String toString() {
        return getName()+ "\n" + "площадь помещения:" + getArea() + "\n" + "цена за кв. метр: " + getCost() + "\n" + "полная стоимость " +  getPricePerArea() ;
    }
}

