import java.util.Calendar;

public class Collaborators {
    private static int amountOfCollaborators = 0;

    private String name;
    private int salary;
    private int birthYear;
    private int id;

    public Collaborators() {
    }

    public Collaborators(String cName, int cSalary, int cBirthYear) {
        this.name = cName;
        this.salary = cSalary;
        this.birthYear = cBirthYear;
        this.id = getAmountOfCollaborators();
        addCollaborator();
    }

    public void addCollaborator(){ amountOfCollaborators++; }

    public int getAmountOfCollaborators(){ return amountOfCollaborators; }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){ return this.salary; }
    public int getAge(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - this.birthYear;
    }

    public void setSalary(int amount){
        this.salary = amount;
    }

    public static void printArray(Collaborators[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Идентификатор: " + arr[i].getId());
            System.out.println("ФИО: " + arr[i].getName());
            System.out.println("Зарплата: " + arr[i].getSalary());
            System.out.println("Возраст: " + arr[i].getAge());
            System.out.println();
        }
    }
    public static void printElderThan(Collaborators[] arr, int age){
        System.out.println("-----------");
        for(int i = 0; i < arr.length; i++){
            if (arr[i].getAge() >= age) {
                System.out.println("ФИО: " + arr[i].getName());
                System.out.println("Возраст: " + arr[i].getAge());
                System.out.println("-----------");
            }
        }
    }

    public static void increaseSalary(Collaborators[] arr, int age, int amount){
        for(int i = 0; i < arr.length; i++){
            if (arr[i].getAge() >= age) {
                arr[i].setSalary(arr[i].getSalary() + amount);
            }
        }
    }

    public static double averageSalary(Collaborators[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i].getSalary();
        return sum / arr.length;
    }

    public static int averageAge(Collaborators[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i].getAge();
        return sum / arr.length;
    }

}
