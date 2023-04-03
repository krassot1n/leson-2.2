

public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw , name = " + name +
                "smart = " + smart +
                ", wise = " + wise +
                ", witty = " + witty +
                ", creativity = " + creativity +
                ", magicPower = " + magicPower +
                ", transgressionDistance = " + transgressionDistance;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    public static void compareRavenclawStudents(Ravenclaw one, Ravenclaw two) {
        int firstStudent = one.getCreativity() + one.getSmart() + one.getWise() + one.getWitty();
        int secondStudent = two.getCreativity() + two.getSmart() + two.getWise() + two.getWitty();
        if (firstStudent > secondStudent) {
            System.out.println(one.getName() + " лучший Когтевранец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Когтевранец, чем " + one.getName());
        }
    }
}
