import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    private String playerName;
    private int playerHP;
    private int playerHit = (int) (5 + Math.random() * 6);
    private final int hardHit = 11;

    public Player() {
    }

    public void setPlayerName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        playerName = "";
        while (!playerName.equals("Рустамыч") | !playerName.matches("[а-яА-Я]+")) {
            this.playerName = reader.readLine();
            if (playerName.equals("Рустамыч")) {
                System.out.println("God mode activated!");
                setPlayerHP(50);
            } else if (playerName.matches("[а-яА-Я]+")) {
                setPlayerHP(40);
                break;
            } else
                System.out.print("Имя должно содержать только буквы русского алфавита!\nВведи имя персонажа еще раз: ");
        }
    }

    private void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    // добавыить возможность промаха (если введено неверное действие например)
    public int getPlayerHit(String typeOfHit) {
        return (typeOfHit.equals("ударить тролля")
                ? playerHit : typeOfHit.equals("ударить тролля топором")
                ? hardHit : 0);
    }
}
