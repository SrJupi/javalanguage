package itacademy.lsr.javalanguage.task04.n1e02.n2e01;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName (){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean equals (Object obj){
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Person)){
            return false;
        }

        Person objToEvaluate = (Person) obj;

        return objToEvaluate.getFirstName().length() + objToEvaluate.getLastName().length() ==
                this.getFirstName().length() + this.getLastName().length();
    }

    public String toString (){
        return "name size: " + (this.getFirstName().length() + this.getLastName().length());
    }
}
