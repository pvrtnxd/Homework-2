public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 10;
        System.out.println("Значение переменной а с типом int равно " + a );
        byte b = -127;
        System.out.println("Значение переменной b с типом byte равно " + b );
        short c = 1;
        System.out.println("Значение переменной c с типом short равно " + c );
        long d = 239_847_231L;
        System.out.println("Значение переменной d с типом long равно " + d );
        float e = 0.5f;
        System.out.println("Значение переменной e с типом float равно " + e );
        double f = 14.89;
        System.out.println("Значение переменной f с типом double равно " + f );

        System.out.println("Задание 2");
        float Number1 = 27.12f;
        long Number2 = 987_678_965_549L;
        double Number3 = 2.786;
        boolean Number4 = false;
        char Number5 = 569;
        short Number6 = -159;
        int Number8 = 27897;
        byte Number7 = 67;

        System.out.println(Number1);
        System.out.println(Number2);
        System.out.println(Number3);
        System.out.println(Number4);
        System.out.println(Number5);
        System.out.println(Number6);
        System.out.println(Number7);
        System.out.println(Number8);

        System.out.println("Задание 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int totalPaper = 480;
        int paperForStudent = totalPaper/(LP+AS+EA);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        System.out.println("Задание 4");
        int Machine = 16; // 2 минуты
        int per1 = Machine*10;
        System.out.println("За 20 минут машина произвела бутылок " + per1 + " штук");
        int per2 = (24*60/2)*Machine;
        System.out.println("За сутки машина произвела бутылок " + per2 + " штук");
        long per3 = per2*3;
        System.out.println("За 3 дня машина произвела бутылок " + per3 + " штук");
        long per4 = per3*10;
        System.out.println("За месяц машина произвела бутылок " + per4 + " штук");

        System.out.println("Задание 5");
        short totalCount = 120;
        short White = 2;
        short Brown = 4;
        int classesCount = totalCount/(White+Brown);
        White *= classesCount;
        Brown *= classesCount;
        System.out.println("В школе, где " + classesCount+ " классов, нужно " + White + " банок белой краски и " + Brown + " банок коричневой краски");

        System.out.println("Задание 6");
        int weightGr = 5*80 + 2*105 + 2*100 + 4*70;
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Вес завтрака в кг = " + weightKg);

        System.out.println("Задание 7");
        int firstVersion = 7000/250;
        int secondVersion = 7000/500;
        System.out.println("За " + firstVersion + " дней спортсмен сбросит 7 кг, если будет худеть на 250гр в день");
        System.out.println("За " + secondVersion + " дней спортсмен сбросит 7 кг, если будет худеть на 500гр в день");
        int middle = (firstVersion+secondVersion)/2;
        System.out.println("В среднем потребуется " + middle);

        System.out.println("Задание 8");
        long Masha = 67760;
        long god1 = 12*Masha;
        long Redis = 83690;
        long god2 = 12*Redis;
        long Christina = 76230;
        long god3 = 12*Christina;
        Masha = Masha + Masha*10/100;
        Redis = Redis + Redis*10/100;
        Christina = Christina + Christina*10/100;
        long newGod1 = 12*Masha;
        long newGod2 = 12*Redis;
        long newGod3 = 12*Christina;
        long diff1 = newGod1 - god1;
        long diff2 = newGod2 - god2;
        long diff3 = newGod3 - god3;
        System.out.println("Маша теперь получает " + Masha + " рублей. Годовой доход вырос на " + diff1 + " рублей.");
        System.out.println("Денис теперь получает " + Redis + " рублей. Годовой доход вырос на " + diff2 + " рублей.");
        System.out.println("Кристина теперь получает " + Christina + " рублей. Годовой доход вырос на " + diff3 + " рублей.");




    }
}