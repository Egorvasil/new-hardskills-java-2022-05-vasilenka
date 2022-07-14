package entities;
/**
 * Student entity
 */
public class Student {
    /**
     * will be 1 student
     */
    protected final String firstname;
    protected final String lastname;
    protected final String group; //STF-2120
    protected double averageMark;
    public Student(String firstname, String lastname, String group, double averageMark){
        this.firstname=firstname;
        this.lastname=lastname;
        this.group=group;
        this.averageMark=averageMark;
    }

    public int getScholarship(){
        if(this.averageMark==10.0){
            return 150; //BYN
        }
        return 100; //BYN
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

}
