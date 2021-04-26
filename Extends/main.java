package Extends;

public class main {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        student s1 = new student();

        t1.setName("秦汉");
        t1.setAge(28);
        t1.teather();
        System.out.println(t1.getName()+","+t1.getAge()+"岁");

        System.out.println("----------");

        s1.setName("大狗蛋");
        s1.setAge(18);
        s1.student();
        System.out.println(s1.getName()+","+s1.getAge()+"岁");
    }
}
