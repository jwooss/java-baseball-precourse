package domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baseball {

    private static final int REQUIRED_NUMBER_COUNT = 3;

    private final List<BaseballNumber> numbers;

    private Baseball(List<BaseballNumber> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("야구공을 입력해야 합니다.");
        }

        Set<BaseballNumber> set = new HashSet<>(numbers);
        if (set.size() != REQUIRED_NUMBER_COUNT) {
            throw new IllegalArgumentException("3개의 야구공을 입력해야 합니다.");
        }


        this.numbers = Collections.unmodifiableList(numbers);
    }

    public static Baseball from(List<BaseballNumber> numbers) {
        return new Baseball(numbers);
    }
}
