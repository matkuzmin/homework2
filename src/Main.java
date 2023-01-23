

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog +4;
        cat = cat+4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5 ;
        cat = cat -  1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        friend = friend + 2;
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog= frog + 4;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalWeight = firstFighter + secondFighter;
        System.out.println("Общий вес двух бойцов " + totalWeight + "кг!");
        var weightDifference = secondFighter - firstFighter;
        System.out.println("Разница в весе двух бойцов " + weightDifference + "кг!");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var weightDifference = secondFighter - firstFighter;
        System.out.println("Разница в весе двух бойцов " + weightDifference + "кг!");
        var weightDifference2 = secondFighter % firstFighter;
        System.out.println("Разница в весе двух бойцов " + weightDifference2 + "кг!");
    }
    public static void task8 () {
        System.out.println("Задача 8");
var allHours = 640 ;
var watch = 8;
var staff = allHours / watch;
System.out.println("Всего в компании " + staff + " сотрудников");
var staff2 = 94;
var totalStaf = staff + staff2;
var allHouse2 = totalStaf * watch;
System.out.println("Если в компании работает " + totalStaf + " человек, то всего " + allHouse2 + " часов работы может быть поделено между сотрудниками");

    }
}
