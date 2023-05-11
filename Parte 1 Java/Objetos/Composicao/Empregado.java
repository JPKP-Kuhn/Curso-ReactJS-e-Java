public class Empregado {
    private static int count = 0; // number of Employees created
    private String firstName;
    private String lastName;
    public Empregado(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
     ++count; // increment static count of employees
     }
     public static int getCount() {
     return count;
     }
    public Object getFirstName() {
        return firstName;
    }
    public Object getLastName() {
        return lastName;
    }
    }