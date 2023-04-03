

public class Hogwarts {
    String name;
    int magicPower;
    int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Имя студента - '" + name +
                ", Сила магии - " + magicPower +
                ", Дальность трансгресии " + transgressionDistance;
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int firstStudent = student1.getMagicPower() + student1.getTransgressionDistance();
        int secondStudent = student2.getMagicPower() + student2.getTransgressionDistance();
        if (firstStudent > secondStudent) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName());
        }
    }
}
