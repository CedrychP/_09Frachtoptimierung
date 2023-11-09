// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    int maxTonnage = 20;
    int maxRaumbedarf = 12;
    int maxVerfuegbar = 8;
    int maxEinheiten = 8;

    int[] gewichtG1 = {2, 2};
    int[] gewichtG2 = {3, 1};
    int[] raumbedarfG1 = {2, 2};
    int[] raumbedarfG2 = {1, 1};
    int[] wert = {30, 20};

    int maxFrachtwert = 0;
    int[] optimalBeladung = new int[2];

    for (int einheitenG1 = 0; einheitenG1 <= maxVerfuegbar; einheitenG1++) {
      for (int einheitenG2 = 0; einheitenG2 <= maxVerfuegbar; einheitenG2++) {
        if (einheitenG1 + einheitenG2 <= maxEinheiten) {
          int gesamtGewicht = einheitenG1 * gewichtG1[0] + einheitenG2 * gewichtG2[0];
          int gesamtRaumbedarf = einheitenG1 * raumbedarfG1[0] + einheitenG2 * raumbedarfG2[0];
          int gesamtWert = einheitenG1 * wert[0] + einheitenG2 * wert[1];

          if (gesamtGewicht <= maxTonnage && gesamtRaumbedarf <= maxRaumbedarf && gesamtWert > maxFrachtwert) {
            maxFrachtwert = gesamtWert;
            optimalBeladung[0] = einheitenG1;
            optimalBeladung[1] = einheitenG2;
          }
        }
      }
    }
    System.out.println("Optimale Beladung:");
    System.out.println("Gut G1: " + optimalBeladung[0] + " Einheiten");
    System.out.println("Gut G2: " + optimalBeladung[1] + " Einheiten");
    System.out.println("Maximaler Frachtwert: " + maxFrachtwert + " k");
  }
}