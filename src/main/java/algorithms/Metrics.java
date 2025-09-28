package algorithms;

public class Metrics {
    public int comparisons = 0;
    public int recursionDepth = 0;
    public int maxDepth = 0;

    public void recordComparison() {
        comparisons++;
    }

    public void enterRecursion() {
        recursionDepth++;
        if (recursionDepth > maxDepth) {
            maxDepth = recursionDepth;
        }
    }

    public void exitRecursion() {
        recursionDepth--;
    }

    public void reset() {
        comparisons = 0;
        recursionDepth = 0;
        maxDepth = 0;
    }
}