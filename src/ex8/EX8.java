package ex8;

//static method
// instance method
class Bonus{
    public static float calBonus(float s){
        return 0.05f*s;
    }
}

public class EX8 {
    public static void main(String[] args) {
        float bonusAll = Bonus.calBonus(6000);
        System.out.println("Bonus = "+ bonusAll+"บาท");
    }
}
