package domain;

public enum GameSignal {

    RESTART(1),
    STOP(2);

    private final int value;

    GameSignal(int value) {
        this.value = value;
    }

    public static GameSignal findByValue(int value) {
        if (RESTART.value == value) {
            return RESTART;
        }

        return STOP;
    }
}
