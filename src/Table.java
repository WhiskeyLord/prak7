public class Table extends Furniture {
    private String woodType;
    Table(int size, int cost, String color, String woodType) {
        super(size, cost, color);
        this.woodType = woodType;
    }
    public String Info(){
        return(super.FurnitureInfo()+woodType);
    }
}
