package Task29;                   //задание 22 страница 49 раб тетрадь

public class IntervalOfTime {
    private int hour;
    private int minut;
    private int second;

    public IntervalOfTime(int h, int m, int s) {
        hour = h;
        minut = m;
        second = s;
    }

    public IntervalOfTime(int allseconds) {
        second = allseconds;
    }

    public int OnlySeconds() {
        return hour * 3600 + minut * 60 + second;
    }

    public void printAllTime() {
        System.out.println("Time1 (only seconds) = " + second);
    }

    public void printDividedTime() {
        System.out.println(String.format("Time2 have %s hours, %s minuts, %s seconds", hour, minut, second));
    }

    public int compareTime() {
        if (this.second >= this.OnlySeconds()) {
            System.out.println("Time1 => Time2");
        } else {
            System.out.println("Time1 < Time2");
        }

        return this.second - this.OnlySeconds();

    }

}


