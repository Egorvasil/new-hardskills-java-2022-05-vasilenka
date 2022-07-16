package HockeyPlayers;

public class Defender extends HockeyPlayer{
    public Defender(String position, int age, int contract, int points, int plusMinus, int salary) {
        super(position, age, contract, points, plusMinus, salary);
    }

    @Override
    public int earnMoney() {
        if(plusMinus>=20){ //super premium
            return salary=salary+PREMIUM*2;
        } else if (plusMinus>=10) { //premium
            return salary=salary+PREMIUM;
        } else if (plusMinus<=0) {
           return salary;
        }
        return salary;

    }
}
