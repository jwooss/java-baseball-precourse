package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseballNumberTest {

    @DisplayName("1보다 작으면 예외가 발생한다")
    @Test
    void valueOf_lessThan()  {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           BaseballNumber.valueOf(0);
        });
    }

    @DisplayName("9보다 크면 예외가 발생한다")
    @Test
    void valueOf_graterThan() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            BaseballNumber.valueOf(10);
        });
    }

    @DisplayName("1에서 9사이의 숫자로 생성한다.")
    @ValueSource(ints = {1,9})
    @ParameterizedTest
    void valueOf(int value) {
        BaseballNumber baseballNumber = BaseballNumber.valueOf(value);
        assertThat(baseballNumber).isEqualTo(BaseballNumber.valueOf(value));
        assertThat(baseballNumber.getValue()).isEqualTo(value);
    }
}
