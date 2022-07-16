package HockeyPlayers;

public class HockeyPlayer {
    private final String position;
    private final int age;
    private final int contract; //year(s)
    protected int points; //goals+assists
    protected int plusMinus; //when you were on the ice and your team scored/loss goal
    protected int salary;
    protected final int PREMIUM = 1000; //extra money for good play

    public HockeyPlayer(String Position, int Age, int Contract, int Points, int PlusMinus, int Salary) {
        this.position = Position;
        this.age = Age;
        this.contract = Contract;
        this.points = Points;
        this.plusMinus = PlusMinus;
        this.salary = Salary;
    }
    public int earnMoney(){ //
        if(points>=15){
            return salary=salary+PREMIUM;
        }
        return salary;
    }
}
