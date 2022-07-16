package HockeyPlayers;

public class Goalie extends HockeyPlayer{
    public Goalie(String position, int age, int contract, int points, int plusMinus, int salary) {
        super(position, age, contract, points, plusMinus, salary);
    }

    @Override
    public int earnMoney() {
        if(plusMinus>=20){ //super premium
            return salary=salary+PREMIUM*2;
        } else if (plusMinus>=10) { //premium
            return salary=salary+1000;
        } else if (plusMinus<=0) {
            return salary;
        }
        return salary;
    }
}
