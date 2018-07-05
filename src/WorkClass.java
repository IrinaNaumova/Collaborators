
public class WorkClass {

    public static void main(String[] args){

        Collaborators c1 = new Collaborators("Иванов Сергей", 35000, 1991);
        Collaborators c2 = new Collaborators("Лежнина Анастасия", 50000, 1975);
        Collaborators c3 = new Collaborators("Сергеев Михаил", 45000, 1980);
        Collaborators c4 = new Collaborators("Макарова Татьяна", 25000, 1995);
        Collaborators c5 = new Collaborators("Петров Алексей", 55000, 1970);

        Collaborators[] collabArr = {c1, c2, c3, c4, c5};
        //printArray(collabArr);

        System.out.println("Сотрудники старше 40 лет: ");
        Collaborators.printElderThan(collabArr, 40);

        System.out.println("Средний возраст всех сотрудников: " +  Collaborators.averageAge(collabArr));
        System.out.println("Средняя зарплата всех сотрудников: " +  Collaborators.averageSalary(collabArr));

        Collaborators.increaseSalary(collabArr, 45, 5000); //Увеличиваем ЗП сотрудникам старше 45 лет на 5000
        System.out.println("Средняя зарплата всех сотрудников: " +  Collaborators.averageSalary(collabArr));

    }

}
