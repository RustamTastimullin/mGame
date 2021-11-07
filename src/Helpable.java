interface Helpable {
    default void help() {
        System.out.println("\nЭто моя первая игра, так что не будьте слишком строги... :)");
        System.out.println("Главная цель игры - убить тролля за 4 удара!");
        System.out.println("Чтобы нанести удар напиши 'ударить тролля'.");
        System.out.println("Чтобы начать игру напиши 'играть'.");
        System.out.println("Чтобы выйти из игры напиши 'выход'.");
    }
    default void instructions() {
        System.out.println("\nЧтобы нанести удар напиши 'ударить тролля'.");
        System.out.println("Чтобы начать игру заново напиши 'играть'.");
        System.out.println("Чтобы выйти из игры напиши 'выход'.");
    }
    default void intro() {
        System.out.println("Приветствую, игрок! Ты играешь в игру 'Убить троля' v1.1");
        System.out.println("\nНапиши 'помощь' чтобы увидеть правила игры.");
        System.out.println("Напиши 'играть' чтобы начать играть.");
        System.out.println("Чтобы закончить игру напиши: 'выход'.");
        System.out.println();
    }
    default void introToFight() {
        System.out.println("Ну...понеслась...");
        System.out.println("...");
    }
    default void hint1() {
        System.out.println("\nДруг, за твою настойчивость дам тебе подсказку:");
        System.out.println("убить тролля за 4 удара тебе поможет Шелдон Купер");
        System.out.println("он играл в похожую игру где-то в 4м сезоне ;-)");
    }
    default void hint2() {
        System.out.println("\nПодсказка!");
        System.out.println("Советую все же воспользоваться подсказкой про Шелдона ;-)");
        System.out.println("У тебя в арсенале может быть какое-нибудь другое оружие помимо меча ;-)");
    }
    default void hint3() {
        System.out.println("\nНу раз ты такой настойчивый...");
        System.out.println("вот тебе серия в которой Шелдон играл в эту игру: s04ep06");
    }
}