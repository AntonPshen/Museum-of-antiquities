import org.w3c.dom.ls.LSOutput;

public class Artifact {
    String culture;
    int century;

    static int count = 0;

    // Конструктор №1
    public Artifact() {
        count++;
        this.culture = count + ". " + "Артефакт неизвестной культуры.";
    }

    // Конструктор №2
    public Artifact(String culture) {
        count++;
        this.culture = count + ". " + "Артефакт культуры " + culture + " неизвестного века.";
    }

    // Конструктор №3
    public Artifact(String culture, int century) {
        count++;
        this.culture = count + ". " + "Артефакт культуры " + culture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact artifact = new Artifact();
        Artifact aztecs = new Artifact("Ацтеков");
        Artifact aztecs2 = new Artifact("Ацтеков ", 12);

        System.out.println(artifact.culture);
        System.out.println(aztecs.culture);
        System.out.println(aztecs2.culture + aztecs2.century + " века.");
        System.out.println("Общее количество артефактов: " + count);
    }
}
