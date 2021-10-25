package AutomatedTestingAndTDD;

public class NextDayCalculatorTest {
    public static void main(String[] args) {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        nextDayCalculator.tinhsongaytrongthang(1, 1, 2018);
        nextDayCalculator.tinhsongaytrongthang(31, 1, 2018);
        nextDayCalculator.tinhsongaytrongthang(30, 4, 2018);
        nextDayCalculator.tinhsongaytrongthang(28, 2, 2018);
        nextDayCalculator.tinhsongaytrongthang(29, 2, 2020);
        nextDayCalculator.tinhsongaytrongthang(31, 12, 2018);
    }
}

