import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.intro();
        // put one string
//        System.out.print("Для начала введи имя перонажа: ");
        // Player player = new Player();
        // player.setPlayerName();
        // System.out.println("Итак " + player.getPlayerName() + ", ты начинаешь игру с: " + player.getPlayerHP() + " HP");
        // Monster trollMonster = new Monster("мистер Тролль", 40);
        // System.out.println("...твой враг: " + trollMonster.getMonsterName()
        //         + ", у которого: " + trollMonster.getMonsterHP() + " HP");
        // System.out.println();

        System.out.print("Напиши команду: ");
        // как бы входим в меню для выбора функции (играть / помощь / выход)
        menu.selectableMenu();
    }
}