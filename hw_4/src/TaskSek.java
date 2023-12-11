import java.util.Scanner;

public class TaskSek {
    public static void main(String[] args) {

        int start = 9;
        int middle = 14;
        int end = 17;

        Scanner sc = new Scanner(System.in);
        int currentTime = sc.nextInt();

        if (currentTime < 9) {
            System.out.println("рабочий день еще не начался");
        } else if (currentTime > 17) {
            System.out.println("рабочий день закончился. До завтра!");
        } else if (currentTime == start) {
            System.out.println("До конца рабочего дня осталось 28 800 секунд");
            System.out.println("Или 8 часов");
        } else if (currentTime == middle) {
            System.out.println(" До конца рабочего дня осталось 10 800 секунд");
            System.out.println("Или 3 часа");
        } else if (currentTime == end) {
            System.out.println("До конца рабочего дня осталось 0. Идите домой");
        } else {
            System.out.println("Вам осталось работать  " + ((end - currentTime)*3600) + " " +
                     "секунд");
            System.out.println("или " + (end - currentTime) + " " +
                    "часов");
        }

    }
}

/*
№2
Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов —
на табло отображается «0» (т.е. рабочий день закончился).

Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
 сколько полных часов осталось до конца рабочего дня.
Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».

Объяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число
из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто понимает в секундах)
и на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов,
содержащихся в n секундах.

 */