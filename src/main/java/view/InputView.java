package view;

import domain.BaseballNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String BASEBALL_SEPARATOR = "";
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static List<BaseballNumber> readBaseballNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        String[] numbers = SCANNER.nextLine().split(BASEBALL_SEPARATOR);

        List<BaseballNumber> baseballNumbers = new ArrayList<>();
        for (String number : numbers) {
            baseballNumbers.add(BaseballNumber.valueOf(number));
        }

        return baseballNumbers;
    }

    public static int read() {
        // System.out.println(MOVE_COUNT_QUESTION);
        return SCANNER.nextInt();
    }
}
