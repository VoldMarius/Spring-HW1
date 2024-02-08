package org.example;

import Model.Person;

public class Program {
    public static final String FILE_JSON = "persons.json";
    private static final ConsoleView cv = new ConsoleView();

    public static void main(String[] args) {

        while (true) {
            try {
                switch (cv.menu()) {
                    // Сериализация данных
                    case 1 -> new AppExternalization().serializationPerson(FILE_JSON, new Person(cv.inputFirstName(), cv.inputLastName(), cv.inputAge()));
                    // Десериализация данных
                    case 2 -> new AppExternalization().deSerializationPerson(FILE_JSON);
                    // Закрытие приложения
                    case 0 -> System.exit(0);
                    default -> System.out.println("Некорректный ввод");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}