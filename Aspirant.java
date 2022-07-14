package entities;
/**
 * Aspirant entity
 */
public class Aspirant extends Student{
    private final String aspirantWork;
    public Aspirant(String aspirantWork, String firstname, String lastname, String group, double averageMark) {
        super( firstname, lastname, group, averageMark);
        this.aspirantWork = aspirantWork;
    }
    public String getAspirantWork(){
        return aspirantWork;
    }
    @Override
    public int getScholarship() { //amount of scholarship
        if (averageMark == 5.0) return 300;
        return 200;
    }
}
