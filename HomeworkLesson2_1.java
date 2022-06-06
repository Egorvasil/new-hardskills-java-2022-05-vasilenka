public class HomeworkLesson2_1 {

    static long salary = 75_000;

    public static void main(String[] args) {
        getTaxes();
    }

    public static void getTaxes() {
        double taxes = 0.13;
        System.out.println(salary-salary*taxes);
    }

}