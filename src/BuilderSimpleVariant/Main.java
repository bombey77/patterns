package BuilderSimpleVariant;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("Roman")
                .setSurname("Motovilov")
                .setAge(33)
                .setSalary(18000)
                .build();

        System.out.println(person.getName());
        System.out.println(person.getSurname());
    }
}



