package com.company;

public class Main {

    public static void main(String[] args) {
	byte ball = 5;
    short dall = 500;
    int nail = 10;
    long salt = 35L;
    float apple = 33.5f;
    double sugar = 1.2;
        System.out.println();


    float weightOneBoxer = 78.2f;
    float weightTwoBoxer = 82.7f;
    float weightBoxers = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общий вес боксеров" + weightBoxers + "кг");
    float  weightDifference = weightTwoBoxer - weightOneBoxer;
        System.out.println("разница в весе" + weightDifference + "кг");


    var banana = 5;
    var milk = 200;
    var ice = 2;
    var egg = 4;
    var breakfast = banana * 80 + milk * 1.05 + ice * 100 + egg * 70;
        System.out.println("Вес в граммах" + breakfast);
    var breakfastKg =  breakfast / 1000;
        System.out.println("Вес в килограммах" + breakfastKg);


    var weight = 7;
    var day250 = weight * 1000 / 250;
        System.out.println("количество дней при похудении на 250 граммов в день" + day250);
    var day500 = weight * 1000 / 500;
        System.out.println("количество дней при похудении на 500 граммов в день" + day500);



    var Masha = 67760;
    var Denis = 83690;
    var Kristina = 76230;
    var MashaNew = Masha + Masha * 10 / 100;
    var DenisNew = Denis + Denis  * 10 / 100;
    var KristinaNew = Kristina + Kristina * 10 / 100;
    var MashaYear = Masha * 12;
    var DenisYear = Denis * 12;
    var KristinaYear = Kristina * 12;
    var MashaNewYear = MashaNew * 12;
    var DenisNewYear = DenisNew * 12;
    var KristinaNewYear = KristinaNew * 12;
    var MashaDifference = MashaNewYear - MashaYear;
        System.out.println("Маша теперь получает" + MashaNew + "рублей. годовой доход вырос на" + MashaDifference);
    var DenisDifference = DenisNewYear - DenisYear;
        System.out.println("Денис теперь получает" + DenisNew + "рублей. годовой доход вырос на" + DenisDifference);
    var KristinaDifference = KristinaNewYear - KristinaYear;
        System.out.println("Кристина теперь получает" + KristinaNew + "рублей. годовой доход вырос на" + KristinaDifference);
    }
}
