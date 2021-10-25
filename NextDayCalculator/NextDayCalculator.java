package AutomatedTestingAndTDD;

public class NextDayCalculator {
    void tinhsongaytrongthang(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day <= 30) {
                    System.out.println(" Ngày Tiếp Theo : " + (day + 1) + " Tháng  " + month + " Năm " + year);
                } else if (month < 12) {
                    System.out.println(" Ngày Tiếp Theo : " + 1 + " Tháng  " + (month + 1) + " Năm " + year);
                } else {
                    System.out.println(" Ngày Tiếp Theo : " + 1 + " Tháng  " + 1 + " Năm " + (year + 1));
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day <= 29) {
                    System.out.println(" Ngày Tiếp Theo : " + (day + 1) + " Tháng  " + month + " Năm " + year);
                } else if (month < 11) {
                    System.out.println(" Ngày Tiếp Theo : " + 1 + " Tháng  " + (month + 1) + " Năm " + year);
                }

                break;
            case 2:
                if (day <= 27) {
                    System.out.println(" Ngày Tiếp Theo : " + (day + 1) + " Tháng  " + month + " Năm " + year);
                } else {
                    System.out.println(" Ngày Tiếp Theo : " + 1 + " Tháng  " + (month + 1) + " Năm " + year);
                }
        }
    }

}




