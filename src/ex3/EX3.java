package ex3;

class Wage{
    // Method Wage
    public int hour;
    public float rate;
    public float calWage(){
        float total = (40*rate)+(hour-40)*(1.5f*rate);
        return total;
    }
}

public class EX3 {
    public static void main(String[] args) {
        Wage emp_wage = new Wage();
        emp_wage.hour = 50;
        emp_wage.rate = 200.f;
        System.out.println("ค่าแรงรวม = " + emp_wage.calWage() + "บาท");
    }
}
