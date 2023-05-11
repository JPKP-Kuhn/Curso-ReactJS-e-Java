public class Main {
    public static void main(String[] args){

        System.out.printf("Employees before instantiation: %d%n", Empregado.getCount());
        Empregado e1 = new Empregado("José", "Silva");
        Empregado e2 = new Empregado("Maria", "Santos");
        System.out.printf("Número de empregados: %d%n", Empregado.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
    }
}
