public class Main {
    public static int random() {
        return (int) (Math.random() * 99);
    }

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", random(), random(), random(), random(), random());
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", random(), random(), random(), random(), random());
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", random(), random(), random(), random(), random());

        Hufflepuff zakharyaSmith = new Hufflepuff("Захария Смит", random(), random(), random(), random(), random());
        Hufflepuff sedrickDiggory = new Hufflepuff("Седрик Диггори", random(), random(), random(), random(), random());
        Hufflepuff justinFinchFlatchly = new Hufflepuff("Джастин Финч-Флечли", random(), random(), random(), random(), random());

        Ravenclaw chjoyChang = new Ravenclaw("Чжоу Чанг", random(), random(), random(), random(), random(), random());
        Ravenclaw padmePattil = new Ravenclaw("Падме Паттил", random(), random(), random(), random(), random(), random());
        Ravenclaw markusBelby = new Ravenclaw("Маркус Белби", random(), random(), random(), random(), random(), random());

        Slytherin drakoMalfoy = new Slytherin("Драко Малфой", random(), random(), random(), random(), random(), random(), random());
        Slytherin gregoryGoil = new Slytherin("Грегори Гойл", random(), random(), random(), random(), random(), random(), random());
        Slytherin grakhamMontegu = new Slytherin("Грехам Монтегю", random(), random(), random(), random(), random(), random(), random());


        //Сравнение  учеников школы:
        Hogwarts.compareStudents(zakharyaSmith, harryPotter);

        //Сравнение  учеников факультета:
        Gryffindor.compareGryffindorStudents(ronWeasley, hermioneGranger);
        Hufflepuff.compareHufflepuffStudents(zakharyaSmith, justinFinchFlatchly);
        Ravenclaw.compareRavenclawStudents(padmePattil, chjoyChang);
        Slytherin.compareSlytherinStudents(drakoMalfoy, grakhamMontegu);

        //Вывод инфо по ученикам:
        System.out.println(ronWeasley.toString());
        System.out.println(sedrickDiggory.toString());
        System.out.println(markusBelby.toString());
        System.out.println(gregoryGoil.toString());

    }


}