import entities.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Heorhi","Vasilenka",
                                      "STF-2120",5.0);

        Aspirant aspirant = new Aspirant("Project about myself","Veronika",
                                         "Shamak","STF-2120",4.5);

       System.out.println("Scholarship for Student Heorhi: "+student.getScholarship());
       System.out.println("Scholarship for aspirant Veronika: "+aspirant.getScholarship());

        Matrix matrix = new Matrix(3,3);
        Matrix matrix1 = new Matrix(3,3);
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix().length; j++) {
                matrix.getMatrix()[i][j]=i+j;//сделали матрицу чтобы не были все значения 0
            }
        }
        matrix.printMatrix();//выводим матрицу
        matrix.mulByNum(36);//умножаем на число
        System.out.println();//делаем отступ
        matrix.printMatrix();//выводим результат после умножения на число 36
        System.out.println();//делаем отсуп
        matrix.addMatrix(matrix1);//умножаем на другую матрицу
        matrix.printMatrix();//выводим полученную матрицу
    }
}