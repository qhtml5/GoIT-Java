package ua.goit.java.lesson04.task06;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Bank usdBank1 = new USBank(11111, "USA", Currency.USD, 150, 3510.50, 10, 2500000);
        final Bank usdBank2 = new USBank(11112, "USA", Currency.EUR, 100, 1250.50, 25, 1200000);
        final Bank eurBank1 = new EUBank(22222, "France", Currency.EUR, 85, 2500.20, 21, 200000);
        final Bank eurBank2 = new EUBank(22221, "Ukraine", Currency.EUR, 15, 800.15, 125, 50000);
        final Bank chinaBank1 = new ChinaBank(33333, "China", Currency.USD, 125, 1500.10, 145, 615000);
        final Bank chinaBank2 = new ChinaBank(33332, "India", Currency.EUR, 58, 505.50, 145125, 15000);

        final User user1 = new User(1001, "Vasya", 10000, 5, "Google", 2000, usdBank1);
        final User user2 = new User(1002, "Kolya", 11000, 4, "Yandex", 3000, usdBank2);
        final User user3 = new User(1003, "Petya", 20100, 8, "Goit", 5000, eurBank1);
        final User user4 = new User(1004, "Grisha", 20000, 9, "Zavod im.Lenina", 1000, eurBank2);
        final User user5 = new User(1005, "Tolya", 15000, 6, "Velyka kyshenya", 500, chinaBank1);
        final User user6 = new User(1006, "Olya", 6300, 1, "Silpo", 2500, chinaBank2);

        final BankSystem bankSystem = new BankSystemImpl();

        System.out.println(user1);
        bankSystem.withdrawOfUser(user1, 100);
        bankSystem.fundUser(user1, 500);
        bankSystem.transferMoney(user1, user2, 100);
        bankSystem.paySalary(user1);
        System.out.println();

        System.out.println(user2);
        bankSystem.withdrawOfUser(user2, 1000);
        bankSystem.fundUser(user2, 50000);
        bankSystem.transferMoney(user2, user4, 1000);
        bankSystem.paySalary(user2);
        System.out.println();

        System.out.println(user3);
        bankSystem.withdrawOfUser(user3, 10000);
        bankSystem.fundUser(user3, 500);
        bankSystem.transferMoney(user3, user5, 100);
        bankSystem.paySalary(user3);
        System.out.println();

        System.out.println(user4);
        bankSystem.withdrawOfUser(user4, 200);
        bankSystem.fundUser(user4, 5600);
        bankSystem.transferMoney(user4, user5, 1000);
        bankSystem.paySalary(user4);
        System.out.println();

        System.out.println(user5);
        bankSystem.withdrawOfUser(user5, 1256);
        bankSystem.fundUser(user5, 6520);
        bankSystem.transferMoney(user5, user1, 1250);
        bankSystem.paySalary(user5);
        System.out.println();

        System.out.println(user6);
        bankSystem.withdrawOfUser(user6, 256);
        bankSystem.fundUser(user6, 500);
        bankSystem.transferMoney(user6, user4, 2500);
        bankSystem.paySalary(user6);
    }
}
