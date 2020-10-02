public class FurnitureShop {
    private Chair[] ch = new Chair[3];
    private Table[] stol = new Table[3];
    public void FUllShop(Chair[] ch, Table[] stol) {
        for (int i = 0; i < 3; i++) {
            this.ch[i] = ch[i];
            this.stol[i] = stol[i];
        }
      /*  ch[0] = new Chair(100, 1000, "green", "black");
        ch[1] = new Chair(10, 2000, "white", "black");
        ch[2] = new Chair(100, 1500, "purple", "black");
        stol[0] =*/
    }
    public void StoreInfo(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Кресло "+ i+" : " + ch[i].Info());
            System.out.println("Стол "+ i+" : " + stol[i].Info());
        }
    }
}
