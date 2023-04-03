

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor , name = " + name +
                ", nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery +
                ", magicPower = " + magicPower +
                ", transgressionDistance = " + transgressionDistance;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public static void compareGryffindorStudents(Gryffindor one, Gryffindor two) {
        int firstStudent = one.getBravery() + one.getHonor() + one.getNobility();
        int secondStudent = two.getBravery() + two.getHonor() + two.getNobility();
        if (firstStudent > secondStudent) {
            System.out.println(one.getName() + " лучший Гриффиндорец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Гриффиндорец, чем " + one.getName());
        }
    }
}
