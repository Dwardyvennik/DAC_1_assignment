# DAC_1_assignment
 MergeSort
Linear merge with reusable buffer
Insertion sort cutoff for small arrays
Recurrence: T(n) = 2T(n/2) + O(n) → Θ(n log n)
MasterTheorem Case 2

2. QuickSort
Randomized pivot selection
Recurse on smaller partition first
Insertion sort for small arrays
Expected: O(n log n)

3. Deterministic Select
Median-of-medians with groups of 5
Guaranteed O(n) time
Recurrence: T(n) ≤ T(n/5) + T(7n/10) + O(n)

4. Closest Pair
2D divide and conquer
Sort by x, recursive split, strip check
Recurrence: T(n) = 2T(n/2) + O(n) → Θ(n log n)
Metrics Tracked
Execution time
Comparison operations
Recursion depth
Memory allocations

meven test 
mvn compile
mvn test
mvn package
