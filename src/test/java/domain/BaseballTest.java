package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BaseballTest {

    @DisplayName("야구번호 3개를 가질 수 있다.")
    @Test
    void from() {
        List<BaseballNumber> numbers = new ArrayList<>();
        numbers.add(BaseballNumber.valueOf(1));
        numbers.add(BaseballNumber.valueOf(2));
        numbers.add(BaseballNumber.valueOf(3));

        Baseball.from(numbers);
    }

    @DisplayName("야구번호 3개가 아니면 예외가 발생한다.")
    @Test
    void from_count() {
        List<BaseballNumber> numbers = new ArrayList<>();
        numbers.add(BaseballNumber.valueOf(1));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Baseball.from(numbers);
        });
    }

    @DisplayName("중복된 야구번호는 예외가 발생한다.")
    @Test
    void from_unique() {
        List<BaseballNumber> numbers = new ArrayList<>();
        numbers.add(BaseballNumber.valueOf(1));
        numbers.add(BaseballNumber.valueOf(1));
        numbers.add(BaseballNumber.valueOf(1));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Baseball.from(numbers);
        });
    }
}