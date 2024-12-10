package uk.gegc.effectiveJava.part2;


/*Task: Create an immutable Person class with many optional parameters
 (name, surname, age, address, phone, email).Use the Builder pattern.*/
public class Person {
    private final String name;
    private final String surname;
    private final Integer age;
    private final String address;
    private final String phone;
    private final String email;

    private Person(Builder builder){
        name = builder.name;
        surname = builder.surname;
        age = builder.age;
        address = builder.address;
        phone = builder.phone;
        email = builder.email;
    }

    public static class Builder{
        private final String name;
        private final String surname;
        private Integer age;
        private String address;
        private String phone;
        private String email;

        public Builder(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder age(Integer age){
            this.age = age;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person.Builder("Aleksei", "Lazunin").age(35).email("gegcuk@gmail.com").build();
        System.out.println(p);
    }
}

