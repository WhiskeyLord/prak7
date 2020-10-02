public class Chair extends Furniture {
    private String handleColor;
    Chair(int size, int cost, String color, String handleColor) {
        super(size, cost, color);
        this.handleColor = handleColor;
    }
    public String Info(){
        return(super.FurnitureInfo()+handleColor);
    }
}
