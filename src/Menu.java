import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu implements Helpable {
    private int playCounter = 0; // счётчик игр
    BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
    String select;

    public Menu() throws IOException {
    }
    public int getPlayCounter() {
        return this.playCounter;
    }
    public void selectableMenu() throws IOException {
        select = reader.readLine();
        while (!select.equals("выход")) {
            if (select.equals("помощь")) {
                help();
            } else if (!select.equals("помощь") && !select.equals("играть")) {
                System.out.println("Такой команы не существует, введи одну из доступных команд.");
            }
            if (select.equals("играть")) {
                introToFight();
                // бой должен быть реализован в другом классе!!!
                // если посреди боя вводится команда "помощь" тогда вызываем instructions();
                this.playCounter++;
                // запускаем модуль боя!!! (создать)
                System.out.println("Попытка № " + playCounter);  // перенести в класс где будет реализован бой
//                Fight.fight();
                if (playCounter == 2) {hint1();}
                if (playCounter > 2 && playCounter < 5) {hint2();}
                if (playCounter >= 5 && playCounter < 8) {hint3();}
            }
            System.out.print("Напиши команду: ");
            select = reader.readLine();
        }
        System.out.println("Еще увидимся... :) ");
    }
}