import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by poyangerami on 2017-11-26.
 */
public class ParallelSort {
    /**
     * @param args
     */
    public static void main(String[] args) {
        seq();
        par();
    }

    private static void seq() {
        System.out.println("sec");
        long start = System.nanoTime();
        int[] ints = ThreadLocalRandom.current().ints(100_000_000).toArray();
        Arrays.sort(ints);
        System.out.println((System.nanoTime() - start) / 1000000);
    }

    private static void par() {
        System.out.println("par");
        long start = System.nanoTime();
        int[] ints = ThreadLocalRandom.current().ints(100_000_000).toArray();
        Arrays.parallelSort(ints);
        System.out.println((System.nanoTime() - start) / 1000000);
    }
}
