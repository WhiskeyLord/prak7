public abstract class  Furniture {
    private int size;
    private int cost;
    private String color;
    Furniture(int size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    public String FurnitureInfo(){
        return (size+" " +cost+" "+color+" ");
    }
}

