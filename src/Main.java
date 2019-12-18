public class Main {
    public static void main(String[] args) {
        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();
        VeryCompletexService veryCompletexService = new VeryCompletexService(bubbleSortAlgorithm);
        VeryCompletexService veryCompletexService1 = new VeryCompletexService(quickSortAlgorithm);
    }
}
