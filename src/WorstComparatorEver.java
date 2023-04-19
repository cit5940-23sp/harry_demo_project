import java.util.Comparator;

public class WorstComparatorEver<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return -1;
    }
}
