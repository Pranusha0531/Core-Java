package arrayobject;
import java.util.Objects;

    public class Person {
        double height;
        double weight;
        private String ssn;
        private String phoneNumber;

        public Person(double height,double weight,String ssn,String phoneNumber) {
            this.height = height;
            this.weight=weight;
            this.ssn=ssn;
            this.phoneNumber=phoneNumber;
        }


        @Override
        public boolean equals(Object o) {
            if( o instanceof Person){
                Person otherPerson = (Person) o;
                return this.ssn == otherPerson.ssn;
            }


            return false;
        }
        @Override
        public int hashCode() {
            return Objects.hash(ssn);
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getSsn() {
            return ssn;
        }

        public void setSsn(String ssn) {
            this.ssn = ssn;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
        public static void main(String[] args) {

            Person person1 = new Person(110, 80, "123-45-6789", "123-456-7890");
            Person person2 = new Person(114, 64, "987-65-4321", "987-654-3210");

            System.out.println("person1 equals person2: " + person1.equals(person2));
        }


    }

