package domain;

import java.util.Objects;

public class BaseballNumber {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;

    private final int value;

    public BaseballNumber(int value) {
        if (isInvalidRange(value)) {
            throw new IllegalArgumentException("1 ~ 9 범위의 숫자만 입력 가능합니다.");
        }

        this.value = value;
    }

    private boolean isInvalidRange(int number) {
        return number < MIN_VALUE || number > MAX_VALUE;
    }

    public static BaseballNumber valueOf(int number) {
        return new BaseballNumber(number);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BaseballNumber{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseballNumber that = (BaseballNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
