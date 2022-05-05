public class FullSalary extends Employee{
    private int day;
    private float money;
    public FullSalary(String name,int day,float money){
        super(name);
        this.day=day;
        this.money=money;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public float salary(){
        return money*day;
    }

    @Override
    public String toString() {
        return "FullSalary{" +
                super.toString() +
                ", day=" + day +
                ", money=" + money +
                ", salary=" + salary() +
                '}';
    }
}
