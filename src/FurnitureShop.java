public class FurnitureShop {
    private Chair[] ch = new Chair[3];
    private Table[] stol = new Table[3];
    public void FUllShop(Chair[] ch, Table[] stol) {
        for (int i = 0; i < 3; i++) {
            this.ch[i] = ch[i];
            this.stol[i] = stol[i];
        }
    }
    public void StoreInfo(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Кресло "+ i+" : " + ch[i].Info());
            System.out.println("Стол "+ i+" : " + stol[i].Info());
        }
    }
    public Chair BuyChair(int n){
        System.out.println("Кресло "+ n+" : " + ch[n].Info());
        return (ch[n]);

    }
    public Table BuyTable(int n){
        return (stol[n]);
    }
}
