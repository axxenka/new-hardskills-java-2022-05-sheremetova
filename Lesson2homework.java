public class Lesson2homework {
    static long salary = 75000;

    public static void main(String[] args) {
        getTaxes();
    }

    private static void getTaxes() {
        salary -= salary * 0.13;
        System.out.println(salary);
    }
}
