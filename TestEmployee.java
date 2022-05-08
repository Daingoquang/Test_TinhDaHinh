public class TestEmployee {
    public static void main(String[] args) {
        PartSalary partSalary=new PartSalary("A",20,25);
        System.out.println(partSalary);
        partSalary.setDay(25);
        System.out.println("New salary of Part-Time: "+partSalary.salary());
        partSalary.setMoney(50);
        System.out.println("New salary of Part-Time (x2):"+partSalary.salary());
        partSalary.setName("D");
        System.out.println(partSalary);
        FullSalary fullSalary=new FullSalary("B",30,45);
        System.out.println(fullSalary);
        fullSalary.setDay(28);
        System.out.println("New salary of Full-Time: "+fullSalary.salary());
        fullSalary.setMoney(48);
        System.out.println("New salary of Full-Time: "+fullSalary.salary());
    }
}
