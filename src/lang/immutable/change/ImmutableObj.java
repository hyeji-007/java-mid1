package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
// Ctrl + Alt + N >> 변수 합치기
//        ImmutableObj immutableObj = new ImmutableObj(result);
//        return immutableObj;
    }

    public int getValue() {
        return value;
    }


}
