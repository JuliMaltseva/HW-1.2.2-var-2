public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int nameOne = 987654;
        System.out.println("Значение переменной "+ "nameOne" + " c типом unt равно "+ nameOne);
        byte nameTwo = 77;
        System.out.println("Значение переменной "+ "nameTwo" + " c типом byte равно "+ nameTwo);
        short nameThree = 12345;
        System.out.println("Значение переменной "+ "nameThree" + " c типом short равно "+ nameThree);
        long nameFour = 998877665544332211L;
        System.out.println("Значение переменной "+ "nameFour" + " c типом long равно "+ nameFour);
        float nameFive = 1.56f;
        System.out.println("Значение переменной "+ "nameFive" + " c типом float равно "+ nameFive);
        double nameSix = 3.1415926535;
        System.out.println("Значение переменной "+ "nameSix" + " c типом double равно "+ nameSix);

        //Задача 2
        System.out.println("Задача 2");
        float firstNumber = 27.12f;
        System.out.println(firstNumber);
        long secondNumber987 = 987678965549L;
        System.out.println(secondNumber987);
        byte thirdNumber = 2;
        System.out.println(thirdNumber);
        short fourthNumber = 786;
        System.out.println(fourthNumber);
        boolean monthNumber = thirdNumber == 11;
        System.out.println(monthNumber);
        short fifthNumber = 569;
        System.out.println(fifthNumber);
        short sixthNumber = -159;
        System.out.println(sixthNumber);
        short seventhNumber = 27897;
        System.out.println(seventhNumber);
        byte eighthNumber = 67;
        System.out.println(eighthNumber);

        //Задача 3
        //У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
        System.out.println("Задача 3");
        byte studentLP = 23;
        byte studentAS = 27;
        byte studentEA = 30;
        int totalStudents = studentLP + studentEA + studentAS;
        System.out.println("Всего в трех классах " + totalStudents + " учеников");
        short totalPaper = 480;
        System.out.println("Всего закупленно бумаги " + totalPaper + " листов");
        int paperForOneStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");

        //Задача 4
        // Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
        //за 20 минут
        //в сутки
        //за 3 дня
        //за 1 месяц
        //Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //Результаты подсчетов выведите в консоль в формате "За … машины произвела бутылок … штук "
        System.out.println("Задача 4");
        byte machineOutputInTwoMinutes = 16;
        int machineOutputInOneMinute = machineOutputInTwoMinutes / 2;
        System.out.println("Производительность машины для изготовления бутылок - " + machineOutputInOneMinute + " бутылок в минуту.");
        int machineOutputInTwentyMinutes = machineOutputInOneMinute * 20;
        System.out.println("За 20 минут работы машина произвела бутылок - " + machineOutputInTwentyMinutes + " штук");
        int oneDay = 24 * 60;
        int machineOutputInOneDay = machineOutputInOneMinute * oneDay;
        System.out.println("В сутки машина произвела бутылок - " + machineOutputInOneDay + " штук");
        int machineOutputInThreeDays = machineOutputInOneDay * 3;
        System.out.println("За 3 дня машина произвела бутылок - " + machineOutputInThreeDays + " штук");
        int machineOutputInOneMonth = machineOutputInOneDay * 31;
        System.out.println("За октябрь машина произвела бутылок - " + machineOutputInOneMonth + " штук");

        //Задача 5
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".
        System.out.println("Задача 5");
        byte paintCans = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        int paintsForOneClass = whitePaintForOneClass + brownPaintForOneClass;
        System.out.println("На один класс уходит " + paintsForOneClass + " банок краски всего");
        int totalClasses = paintCans / paintsForOneClass;
        System.out.println("Всего в школе  " + totalClasses + " классов");
        int totalWhitePaint = whitePaintForOneClass * totalClasses;
        int totalBrownPaint = brownPaintForOneClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски." );

        //Задача 6
        //Бананы – 5 штук (1 банан - 80 грамм);
        //Молоко – 200 мл (100 мл = 105 грамм);
        //Мороженое пломбир – 2 брикета по 100 грамм;
        //Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        System.out.println("Задача 6");
        byte bananaWeightGr = 80;
        byte milkWeightGr = 105;
        byte icecreamWeightGr = 100;
        byte eggWeightGr = 70;
        int breakfastWeightGr = bananaWeightGr * 5 + milkWeightGr * 2 + icecreamWeightGr * 2 + eggWeightGr * 4;
        System.out.println("Вес одной порции завтрака " + breakfastWeightGr + " гр.");
        int grPerKg = 1000;
        float breakfastWeightKg = breakfastWeightGr / (float) grPerKg;
        System.out.println("Вес одной порции завтрака " + breakfastWeightKg + " кг.");

        //Задача 7
        //Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        System.out.println("Задача 7");
        byte overweightKg = 7;
        int overweightGr = overweightKg * grPerKg;
        short minWeightLossPerDay = 250;
        short maxWeightLossPerDay = 500;
        int maxDays = overweightGr / minWeightLossPerDay;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм - " + maxDays + " дней уйдёт на похудение");
        int minDays = overweightGr / maxWeightLossPerDay;
        System.out.println("если спортсмен будет терять каждый день по 500 грамм - " + minDays + " дней уйдёт на похудение");
        int averageWeightLossPerDay = (minWeightLossPerDay + maxWeightLossPerDay) / 2;
        //System.out.println(averageWeightLossPerDay);
        int averageDays = overweightGr / averageWeightLossPerDay;
        System.out.println(averageDays + " дней может потребоваться в среднем, чтобы добиться результата похудения.");

        //int averageWeightLoss = overweightGr % averageWeightLossPerDay;
        // System.out.println(averageWeightLoss);
        //float averageDaysF = (overweightGr /(float) averageWeightLossPerDay);
        // System.out.println(averageDaysF);
        //int averageDaysI = overweightGr / averageWeightLossPerDay;
        // System.out.println(averageDaysI);
        // float averageDays = averageDaysF % averageDaysI;
        // System.out.println(averageDays);



                           }
}