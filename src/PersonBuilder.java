public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = 0;
    protected String city;

    public PersonBuilder(){

    }

    public PersonBuilder(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public PersonBuilder(String surname, int age, String city) {
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст должен быть больше ноля");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Поле \"имя\" обязательно");
        } else if (surname == null) {
            throw new IllegalStateException("Поле \"фамилия\" обязательно");
        } else return new Person(this);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
