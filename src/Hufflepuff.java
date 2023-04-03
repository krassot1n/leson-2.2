

public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return  "Hufflepuff , name = " + name +
                ", hardworking = " + hardworking +
                ", loyal = " + loyal +
                ", honest = " + honest +
                ", magicPower = " + magicPower +
                ", transgressionDistance = " + transgressionDistance;
    }

    public static void compareHufflepuffStudents(Hufflepuff one, Hufflepuff two) {
        int firstStudent = one.getHardworking() + one.getHonest() + one.getLoyal();
        int secondStudent = two.getHardworking() + two.getHonest() + two.getLoyal();
        if (firstStudent > secondStudent) {
            System.out.println(one.getName() + " лучший Пуфендуец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Пуфендуец, чем " + one.getName());
        }
    }
}
