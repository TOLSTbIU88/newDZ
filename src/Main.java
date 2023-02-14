import java.util.Arrays;

public class Main {

            //Базовый уровень
            //Задача №1
            //Дано (их менять нельзя)
            String hi = "                Hello ";
            String world = " WoRld!";
            char newLine = '\n';
            //Создать из трех переменных единую строку,
            //Привести к правильному виду (Ниже), убрать лишние слова,
            //затроить (Можно вызвать тольку одну команду System.out.print())
            //
            //Результат вывода на экран:
            //Hello world!
            //Hello world!
            //Hello world!


            //Задача №2
            //Создать переменные с ростом (!в метрах), весом.
            //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
            //Пример результата вывода на экран:
            //21.0

            //Задача №3
            //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
            //и снова создать строку, вывести на экран


            //Продвинутый уровень
            //Задача №1
            //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

            //Задача №2
            //Посчитать (a+b)^2 = ?, при a=3, b=5

            //Задача №3
            //Создать два массив чисел:
            // 1,2,5,7,10
            // 2,3,2,17,15
            // Создать массив чисел, в котором будут: все числа из этих двух массивов,
            // и результат умножения чисел с одинаковым порядковым номером
            //
            //Ожидаемый результат:
            //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
            //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
            //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

            //Задача №4
            //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

            //Экспертный уровень
            //Задача №1
            //Создать метод маскирования персональных данных, который:
            //Телефон (до/после маскирования): 79991113344 / 7999***3344
            //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
            //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
            //
            //Входящие параметры: String text
            //Возвращаемый результат: String
            //
            //Примеры возможного текста:
            //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
            //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
            //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

            //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
            //Регулярные выражения, класс StringBuilder

    public static void main(String[] args) {

        // DZ1

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String result = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(result.repeat(3));


        // DZ2

        double heit = 1.90;
        double mass = 160.0;
        double result2 = mass / (heit * heit);

        System.out.println(Math.floor(result2));

        // DZ3

        int[] mas1 = {1,2,5,7,10};
        int[] mas2 = {2,3,2,17,15};

        int[] mas4 = new int[mas1.length];

        int[] mas3 = Arrays.copyOf(mas1,( mas1.length + mas2.length + mas4.length));

        for (int i = 0; i < mas4.length; i++) {
            mas4[i] = mas1[i] * mas2[i];
        }


        System.arraycopy(mas2, 0, mas3 ,mas1.length, mas2.length);
        System.arraycopy(mas4, 0, mas3 ,mas1.length + mas2.length, mas4.length);

        System.out.println(Arrays.toString(mas3));

        // DZ4


        String name = "Hello world!";
        System.out.println(name.replace('l','r').toUpperCase().substring(0,8));

    }
}
