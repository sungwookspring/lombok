public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setAge(10);
        student1.setName("Test1");
        student1.printAll();

        /*
            lombok
         */
        Studentlombok student2 = new Studentlombok();
        student2.setAge(20);
        student2.setName("Test2");
        System.out.println(student2.getAge());
        System.out.println(student2.getName());
    }
}


