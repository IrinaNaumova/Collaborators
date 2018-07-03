import java.util.Calendar;

public class Collaborators {
    private static String name;
    private static long salary;
    private static int birthYear;

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

    public long getSlary(){
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


    public static void main(String[] arg){

        Collaborators[] collabArr = new Collaborators[5];

    }

}
