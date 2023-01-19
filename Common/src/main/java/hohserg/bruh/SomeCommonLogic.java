package hohserg.bruh;

import org.apache.commons.lang3.tuple.Pair;

public class SomeCommonLogic {
    public Pair<Integer, String> foo(Pair<Integer, String> v) {
        return Pair.of(v.getLeft() + 1, v.getRight().trim());
    }
}
