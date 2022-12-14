package udemycodingexercises;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainderKiloBytes = kiloBytes % 1024;
            int megaBytes = (kiloBytes - remainderKiloBytes) / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }

    }
}
