

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin , name = " + name + ", cunning = " + cunning + ", determination = " + determination + ", ambition = " + ambition + ", resourcefulness = " + resourcefulness + ", lustForPower = " + lustForPower + ", magicPower = " + magicPower + ", transgressionDistance = " + transgressionDistance + '}';
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public static void compareSlytherinStudents(Slytherin one, Slytherin two) {
        int firstStudent = one.getAmbition() + one.getCunning() + one.getDetermination() + one.getResourcefulness() + one.getLustForPower();
        int secondStudent = two.getAmbition() + two.getCunning() + two.getDetermination() + two.getResourcefulness() + two.getLustForPower();
        if (firstStudent > secondStudent) {
            System.out.println(one.getName() + " лучший Слизеринец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Слизеринец, чем " + one.getName());
        }
    }
}
