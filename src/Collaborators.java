import java.util.Calendar;

public class Collaborators {
    private String name;
    private long salary;
    private int birthYear;

    public Collaborators() {
    }

    public Collaborators(String cName, long cSalary, int cBirthYear) {
        this.name = cName;
        this.salary = cSalary;
        this.birthYear = cBirthYear;
    }

    public String getName(){
        return this.name;
    }

    public long getSalary(){
        return this.salary;
    }

    public int getAge(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - this.birthYear;
    }

    public void setSlary(int amount){
        this.salary = amount;
    }

    public static void printArray(Collaborators[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("ФИО: " + arr[i].getName());
            System.out.println("Зарплата: " + arr[i].getSalary());
            System.out.println("Возраст: " + arr[i].getAge());
            System.out.println();
        }
    }

    public static void main(String[] arg){

        Collaborators c1 = new Collaborators("Иванов Сергей", 35000, 1990);
        Collaborators c2 = new Collaborators("Лежнина Анастасия", 50000, 1975);
        Collaborators c3 = new Collaborators("Сергеев Михаил", 45000, 1980);
        Collaborators c4 = new Collaborators("Макарова Татьяна", 25000, 1995);
        Collaborators c5 = new Collaborators("Петров Алексей", 55000, 1970);

        Collaborators[] collabArr = {c1, c2, c3, c4, c5};
        printArray(collabArr);

    }

}
