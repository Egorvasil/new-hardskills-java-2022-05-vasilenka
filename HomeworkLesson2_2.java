public class HomeworkLesson2_2 {

    static long salary = 1850;

    public static void main(String[] args) {
        getTaxes();
    }

    public static void getTaxes() {
        double taxes = 0.13+0.01;
        System.out.println(salary-salary*taxes);
    }

}