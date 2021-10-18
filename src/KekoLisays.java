import java.util.PriorityQueue;

public class KekoLisays {

    public static void lisaaKekoon (int[] a, int alkio){
        if (a[0] >= MaxPQ) {

        }
        a[0]++;
        int i = a[0];
        while ((i > 1) && (a[i/2] > alkio)){
            a[i] = a[i/2];
            i = i/2;
        }
        a[i] = alkio;
    }


    public static void main(String[] args){
        PriorityQueue<Integer> a = new PriorityQueue<>();


    }

}

