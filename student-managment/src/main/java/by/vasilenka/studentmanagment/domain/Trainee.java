package by.vasilenka.studentmanagment.domain;

public class Trainee {

    private long id;

    private String name;

    private long education_dir_id;

    private double averageGrade;

    public Trainee(long id, String name, long education_dir_id, double averageGrade) {
        this.id = id;
        this.name = name;
        this.education_dir_id = education_dir_id;
        this.averageGrade = averageGrade;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducation_dir_id(long education_dir_id) {
        this.education_dir_id = education_dir_id;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", education_dir_id=" + education_dir_id +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
