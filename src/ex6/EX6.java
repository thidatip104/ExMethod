package ex6;

class coins{
    public int ten,five,one;
}

class Exchagecoin{
    public void findcoin(coins c, int m){
        c.ten = m/10;
        c.five = m/5;
        c.one = m/1;
    }
}

public class EX6 {
    public static void main(String[] args) {
        int money = 25;
        coins coin = new coins();
        Exchagecoin coindata = new Exchagecoin();
        coindata.findcoin(coin,money);
        System.out.println("เงิน "+ money + "บาท แลกได้"+ "เหรียญสิบ "+
                coin.ten + "เหรียญ เหรียญห้า "+ coin.five + "เหรียญ เหรียญบาท "+
                coin.one + "เหรียญ" );

    }
}
