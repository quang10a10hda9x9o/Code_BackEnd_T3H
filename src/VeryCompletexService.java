public class VeryCompletexService {
    private SortAlgorithm sortAlgorithm;
    public VeryCompletexService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void completexBusiness(int arr[]) {
        sortAlgorithm.sort(arr);
    }
}
