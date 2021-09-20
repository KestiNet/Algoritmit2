public class keko {


        public static void korjaaKeko(int[] kLuvut) {
            int i = 0;
            if (2*i > kLuvut[0]) // i:llä ei lapsia,
                return;       // ei tehdä mitään
            int j = 2*i;
            int alkio = kLuvut[i];
            // Siirretään alkiota kohti lehtisolmuja
            while (j <= kLuvut[0])
            {
                if ((j < kLuvut[0]) && (kLuvut[j] > kLuvut[j+1]))
                    j = j+1;
                if (alkio <= kLuvut[j])
                    break; // lopetetaan silmukka
                kLuvut[j/2] = kLuvut[j];
                j = 2*j;
            }
            kLuvut[j/2] = alkio;
        }

    public static void main(String[] args) {
        int[] kLuvut = {1, 5, 4, 6, 7, 6, 8, 321, 4, 2, 87, 213, 6};

        korjaaKeko(kLuvut);
    }
 }


