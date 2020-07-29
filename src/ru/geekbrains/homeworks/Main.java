package ru.geekbrains.homeworks;

public class Main {

    public static void main(String[] args) {

        //Создание объекта с использованием конструктора
        Employee employee1 = new Employee("Belov Sergey Michaylovich", "Engineer", "Sergey.B@yandex.ru","44-70-89", 90000, 25 );
        System.out.println(employee1.toString());


        // Создание объекта, использование сеттера
	    Employee employee2 = new Employee();
        employee2.setFull_name("Baluch Kristina Yurevna");
        employee2.setPosition("Designer");
        employee2.setEmail("Kris.B@yandex.ru");
        employee2.setTel("43-50-50");
        employee2.setSalary(45000);
        employee2.setAge(23);

        System.out.println(employee2.toString());

        System.out.println("Эти сотрудники старше 40 лет:");
        getInfo();


    }

        public static void getInfo (){
            //Массив из 5 сотрудников
            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 70000, 30);
            persArray[1] = new Employee("Simina Valeria", "Engineer", "valery@gmail.ru", "897654321", 70000, 33);
            persArray [2] = new Employee ("Serov Alexander", "manager", "serovAl@yandex.ru", "8987654321", 25000, 41);
            persArray [3] = new Employee ("Ulyanova Sofia", "manager", "sofUl@gmail.ru", "897653457", 30000, 28 );
            persArray [4] = new Employee ("Rozenberg Alexey", "director", "rozzAlex@yandex.ru", "895432167", 100000, 54);

            for (int i = 0; i<persArray.length; i++){
                if (persArray[i].getAge()>40){
                    System.out.println(persArray[i].toString());
                }
            }
    }
}
