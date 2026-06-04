//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printPlant("tomaat", 2, true, 2.5);
        printPlant("komkommer", 30, false, 0.8);
    }

    public static void printPlant(String name, int days, boolean isPlanted, double heightInMeters) {
        System.out.println("Naam: " + name);
        System.out.println("Days: " + days);
        System.out.println("Is planted ? " + isPlanted);
        System.out.println("Height in meters: " + heightInMeters);
    }
}

