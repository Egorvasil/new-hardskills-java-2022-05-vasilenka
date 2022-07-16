package HockeyPlayers;

public class Forward extends HockeyPlayer {
    public Forward(String position, int age, int contract, int points, int plusMinus, int salary) {
        super(position, age, contract, points, plusMinus, salary);
    }

    @Override
    public int earnMoney() {
        if(points>=60){ //super premium
            return salary=salary+PREMIUM*3;
        } else if (points>=35) { //premium
            return salary=salary+PREMIUM;
        } else if (points<15) {
            return salary;
        }
        return salary;
    }
}
