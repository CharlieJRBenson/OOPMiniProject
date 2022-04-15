
public class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {

        // throws error when first or second are null
        if (first.equals(null) || second.equals(null)) {
            throw new IllegalArgumentException("Null value input");
        }

        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

}
