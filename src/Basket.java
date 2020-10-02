public class Basket {
    private int i=0, j= 0;
    private Chair[] ch = new Chair[10];
    private Table[] st = new Table[10];
    public void addToBasketCh(Chair ch){
            this.ch[i] = ch;
            i++;
    }
    public void addToBasketSt(Table st){
        this.st[j] = st;
        j++;
    }
    public void BasketInfo(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Кресло "+ i+" : " + ch[i].Info());
            System.out.println("Стол "+ i+" : " + st[i].Info());
        }
    }
}
