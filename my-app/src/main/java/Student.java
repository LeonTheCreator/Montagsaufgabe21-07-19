public class Student {

    private int age = 24;
    private String name = "Peter";
    private String matricultionNumber = "212727";

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String getMatricultionNumber() {
        return matricultionNumber;
    }

    public String setMatriultionNumber(String matriultionNumber) {
        return this.matricultionNumber = matriultionNumber;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    private static void giveName() {
    }

    public static boolean giveName(String name) {
        Student student1 = new Student();
        if (student1.getName().equals("")) {
            System.out.println("bitte name eingeben!");
        }
        return false;
    }

    public static boolean giveAge(int age) {
        Student student1 = new Student();
        if (student1.getAge() < 0) {
            System.out.println("bitte name eingeben!");
        }
        return false;
    }

    public static boolean matriculationNumber(String age) {
        Student student1 = new Student();
        if (student1.getMatricultionNumber().equals("")) {
            System.out.println("bitte name eingeben!");
        }
        return false;
    }
}
