import HockeyPlayers.Defender;
import HockeyPlayers.Forward;
import HockeyPlayers.Goalie;
import HockeyPlayers.HockeyPlayer;

public class Main {
    public static void main(String[] args) {
        HockeyPlayer [] player = new HockeyPlayer[6];

        player[0]=new Forward("right wing", 27, 2, 65, -2, 3000);
        player[1]=new Forward("center forward", 20, 3, 6, 12, 700);
        player[2]=new Defender("left defender", 32, 3, 14, 23, 2500);
        player[3]=new Defender("right defender", 19,3, 3, 9, 700);
        player[4]=new Goalie("main goalie", 35, 1, 1, 21, 3500);
        player[5]=new Defender("right defender",13, 2, 2, 20, 400);

        System.out.println(player[0].earnMoney());

        System.out.println(player[1].earnMoney());

        System.out.println(player[2].earnMoney());

        System.out.println(player[3].earnMoney());

        System.out.println(player[4].earnMoney());

        System.out.println(player[5].earnMoney());
    }
}