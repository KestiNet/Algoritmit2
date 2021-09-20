public class keko {

    public static void lisaaKekoon(int[] kLuvut, int alkio) {
        if (a[0] >= MAXPQ) {
            //Taulukko täynnä,
            //kasvatetaan kokoa tai heitetään poikkeus
        }
        a[0]++;
        int i = a[0];
        while ((i > 1) && (a[i / 2] > alkio)) {
            a[i] = a[i / 2];
            i = i / 2;
        }
        i = i / 2;
    }

    public static void main(String[] args) {
        int[] kLuvut = {1, 5, 4, 6, 7, 6, 8, 321, 4, 2, 87, 213, 6};

        lisaaKekoon(kLuvut);
    }
}