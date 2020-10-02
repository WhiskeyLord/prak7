public class Person {
    private static Basket personalGarbage = new Basket();
    private static FurnitureShop f1 = new FurnitureShop();
    public void Createshop(){
        Chair[] ch1 = new Chair[3];
        Table[] stol1 = new Table[3];
        ch1[0] = new Chair(100, 1000, "green", "black");
        ch1[1] = new Chair(10, 2000, "white", "black");
        ch1[2] = new Chair(100, 1500, "purple", "black");
        stol1[0] = new Table(100, 1000, "green", "oak");
        stol1[1] = new Table(10, 2000, "white", "oak");
        stol1[2] = new Table(100, 1500, "purple", "birch");
        f1.FUllShop(ch1, stol1);
        f1.StoreInfo();
    }

    public static void main(String[] args){
        Person human1 = new Person();
        human1.Createshop();
        personalGarbage.addToBasketCh(f1.BuyChair(2));
        personalGarbage.addToBasketSt(f1.BuyTable(1));
        personalGarbage.BasketInfo();
    }
}
