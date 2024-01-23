public class Student {
    
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Student st = new Student("Shivani Miriyala");


        System.out.println(st.getName());
    }
}