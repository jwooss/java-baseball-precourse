import domain.BaseballNumber;
import view.InputView;

import java.util.List;

public class BaseballApplication {

    public static void main(String[] args) {
        List<BaseballNumber> baseballNumbers = InputView.readBaseballNumbers();
        System.out.println(baseballNumbers);
    }
}
