//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//// надо создать экземпляр класса?
//public class Fight implements Helpable {
// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Helpable???
//
//        String hit;
////        int enemieHP = 40;
//
//        int selfHP = 40;
//        int hardHit = 11; //use interface???
//        int hitCounter = 0;
//        System.out.println("У тролины " + enemieHP + " хп, у тебя " + selfHP + ", посмотрим кто кого...");
//        while (enemieHP > 0) {
//            System.out.print("Напиши команду: ");
//            hit = reader.readLine();
//
//            if (!hit.equals("ударить тролля") && !hit.equals("ударить тролля топором") && !hit.equals("ударить тролля мечом")) {
//                System.out.println("Напиши 'помощь' чтобы увидеть правила игры.");
//                System.out.println("введи корректную команду...");
//            }
//            if (hit.equals("помощь")) {
//                help();
//            }
//            if (hit.equals("ударить тролля мечом")) {
//                System.out.println("у вас нет меча.");
//                System.out.println("введи другую команду...");
//            }
//
//            if (hit.equals("ударить тролля")){
//                hitCounter++;
//                enemieHP = enemieHP - ((int) (5 + Math.random()*6));
//                if (enemieHP <= 0) {
//                    System.out.println("Сделано ударов: " + hitCounter);
//                    System.out.println("У тролля стало: " + enemieHP + " ХП");
//                    break;
//                }
//                else
//                    selfHP = selfHP - ((int) (6 + Math.random()*5));
//                if (selfHP <= 0){
//                    System.out.println("");
//                    System.out.println("Ты проиграл! :( ");
//                    System.out.println("У тролля осталось: " + enemieHP + " ХП, а у тебя: " + selfHP);
//                    System.out.println("Чтобы начать игру сначала напиши 'играть', чтобы выйти напиши 'выйти'.");
//                    System.out.println("");
//                    break;
//                }
//                else {
//                    System.out.println("У тролля осталось: " + enemieHP + " ХП");
//                    System.out.println("Тролль ударил в ответ, у вас осталось: " + selfHP + " ХП");
//                    System.out.println ("Сделано ударов: " + hitCounter);
//                }
//            }
//
//            if (hit.equals("ударить тролля топором")) {
//                hitCounter++;
//                enemieHP = enemieHP - hardHit;
//                if (enemieHP <= 0) {
//                    System.out.println("Сделано ударов: " + hitCounter);
//                    System.out.println("У тролля стало: " + enemieHP + " ХП");
//                    break;
//                }
//                else
//                    selfHP = selfHP - ((int) (6 + Math.random()*5));
//                if (selfHP <= 0){
//                    System.out.println("");
//                    System.out.println("Ты проиграл! :( ");
//                    System.out.println("У тролля осталось: " + enemieHP + " ХП, а у тебя: " + selfHP);
//                    System.out.println("Чтобы начать игру сначала напиши 'играть', чтобы выйти напиши 'выйти'.");
//                    System.out.println("");
//                    break;
//                }
//                else {
//                    System.out.println("У тролля осталось: " + enemieHP + " ХП");
//                    System.out.println("Тролль ударил в ответ, у вас осталось: " + selfHP + " ХП");
//                    System.out.println ("Сделано ударов: " + hitCounter);
//                }
//            }
//        }
//
//        if (selfHP > 0 && hitCounter > 4) {
//            System.out.println("");
//            System.out.println("Поздравляю, ты победил тролля за: " + hitCounter + " ударов!!!");
//            System.out.println("Цель игры убить тролля за 4 удара, сможешь? ;-)");
//            System.out.println("Теперь можно начать игру сначала или выйти из неё.");
//            System.out.println("");
//        }
//        if (selfHP > 0 && hitCounter <= 4) {
//            System.out.println("");
//            System.out.println("Ура! Ура! Ура! Ты завалил тролля за 4 удара и выполнил главную цель игры!!!");
//            System.out.println("Вселенский респектос тебе, воин!");
//            System.out.println("Обязательно сделай скрин своего результата и отправь мне в инсту: @rustam.tastimullin");
//            System.out.println("я выложу это в сторис в качестве подтверждения, что игра может быть пройдена за 4 хода!");
//            System.out.println("Теперь можно начать игру сначала или выйти из неё.");
//            System.out.println("");
//        }
//
//}
