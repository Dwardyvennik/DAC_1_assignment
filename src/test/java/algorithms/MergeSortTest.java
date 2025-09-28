package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void testSort() {
        int[] arr = {5, 2, 8, 1, 9};
        MergeSort.sort(arr);
        ArrayUtil ArrayUtil;
        assertTrue(algorithms.ArrayUtil.isSorted(arr));
    }

    @Test
    public void testRandomArray() {
        int[] arr = ArrayUtil.generateRandomArray(100);
        MergeSort.sort(arr);
        assertTrue(ArrayUtil.isSorted(arr));
    }

    @Test
    public void testMetrics() {
        int[] arr = ArrayUtil.generateRandomArray(100);
        MergeSort.sort(arr);
        System.out.println("Comparisons: " + MergeSort.metrics.comparisons);
        System.out.println("Max depth: " + MergeSort.metrics.maxDepth);
        assertTrue(MergeSort.metrics.maxDepth > 0);
    }
}