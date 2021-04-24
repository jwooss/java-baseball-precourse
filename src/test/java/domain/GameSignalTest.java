package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class GameSignalTest {

    @DisplayName("숫자 1은 입력하면 RESTART 신호를 나타낸다")
    @Test
    void findByValue_restart() {
        assertThat(GameSignal.findByValue(1)).isEqualTo(GameSignal.RESTART);
    }

    @DisplayName("숫자 1이 아니면 STOP 신호를 나타낸다.")
    @ValueSource(ints = {0, 2})
    @ParameterizedTest
    void findByValue_stop(int value) {
        assertThat(GameSignal.findByValue(value)).isEqualTo(GameSignal.STOP);
    }
}
