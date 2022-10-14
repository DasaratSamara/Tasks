import java.util.Scanner;

public class Main {
    public static int summa(int a, int b) {
        int result;
        result = a + b;
        return result;

    }

    public static int raznost(int a, int b) {
        int rezult;
        rezult = a - b;
        return rezult;

    }

    public static int proizved(int a, int b) {
        int rezult;
        rezult = a * b;
        return rezult;

    }

    public static int delenie(int a, int b) {
        int rezult;
        rezult = a / b;
        return rezult;

    }

    public static int operand2() {
        int operand2;
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Введите операнд 2, целое число:");
        operand2 = scanner.nextInt();// Считывание операнда 2
        return operand2;

    }

    public static void main(String[] args) {

        System.out.println("Добрый день! Перед Вами простой калькулятор!Он может выполнять следующие действия:");
        System.out.println("Сумма - действие сложения");
        System.out.println("Разность - разность между операндом 1 и операндом 2");
        System.out.println("Произведение - умножение операнда 1 на операнд 2");
        System.out.println("Деление - деление операнда 1 на операнд 2");
        char operation = '0';
        int operand1 = 0;
        int operand2 = 0;
        while (operation != 's') {
            Scanner scanner = new Scanner(System.in, "UTF-8");
            if (operand1 == 0) {
                System.out.println("Введите операнд 1, целое число:");
                operand1 = scanner.nextInt();// Считывание операнда 1
            } else {
                System.out.println("операнд 1 равен:" + operand1);// выводим результат
            }

            do {
                System.out.println("Введите действие на латинице C - стереть результат, f - сумма, r-разность, p-произведени,d - деление, s - выключить калькулятор");
                operation = scanner.next().charAt(0);// Считывание операции
                System.out.println(operation == 'f' || operation == 'r' || operation == 'p' || operation == 'd' || operation == 's' || operation == 'C' ? "Ваша операция " + operation : "Операция не поддерживается!Повторите ввод!");
            }
            while (operation != 'f' && operation != 'r' && operation != 'p' && operation != 'd' && operation != 's' && operation != 'C');
            if (operation == 's') {//проверка условия для прекращения цикла while и выключения калькулятора
                continue;
            }

            switch (operation) {
                case 'f':
                    operand2 = Main.operand2();//вызываем метод для считывания второго операнда
                    int rezult = Main.summa(operand1, operand2);//вызываем метод для сложения двух операндов
                    System.out.println("Результат сложения:" + rezult);// выводим результат
                    operand1 = rezult;
                    break;
                case 'r':
                    operand2 = Main.operand2();//вызываем метод для считывания второго операнда
                    rezult = Main.raznost(operand1, operand2);//вызываем метод для вычитания двух операндов
                    System.out.println("Результат вычитания:" + rezult);// выводим результат
                    operand1 = rezult;
                    break;
                case 'p':
                    operand2 = Main.operand2();//вызываем метод для считывания второго операнда
                    rezult = Main.proizved(operand1, operand2);//вызываем метод для произведения двух операндов
                    System.out.println("Результат произведения:" + rezult);// выводим результат
                    operand1 = rezult;
                    break;
                case 'd':
                    operand2 = Main.operand2();//вызываем метод для считывания второго операнда
                    rezult = Main.delenie(operand1, operand2);//вызываем метод для деления двух операндов
                    System.out.println("Результат деления:" + rezult);// выводим результат
                    operand1 = rezult;
                    break;
                case 'C':
                    operand1 = 0;
                    operand2 = 0;
                    rezult = 0;
                    System.out.println("Вы очистили операнды и результат");// выводим результат
                    break;
            }
        }

    }

}
