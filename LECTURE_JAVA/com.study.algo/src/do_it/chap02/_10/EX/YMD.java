package do_it.chap02._10.EX;

import do_it.Input;

// 연습 2-8
// 날짜 클래스
public class YMD {
    int y;
    int m;
    int d;

    // 각 월의 일수
    static int[][] mdays = {
        // 평년
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        // 윤년
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    // year 년이 윤년이려면 1, 평년이면 0
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }
    
    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    // n일 후의 날짜 반환
    YMD after(int n) {
        YMD temp = new YMD(this.y, this.m, this.d);
        if (n < 0)
            return before(-n);

        temp.d += n;

        while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
            temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
            if (++temp.m > 12) {
                temp.y++;
                temp.m = 1;
            }
        }

        return temp;
    }

    // n일 전의 날짜 반환
    YMD before(int n) {
        YMD temp = new YMD(this.y, this.m, this.d);
        if (n < 0)
            return after(-n);

        temp.d -= n;

        while (temp.d < 1) {
            if (--temp.m < 1) {
                temp.y--;
                temp.m = 12;
            }
            temp.d += mdays[isLeap(temp.y)][temp.m - 1];
        }

        return temp;
    }

    public static void main(String[] args) {

        System.out.println("input date ->");
        int y = Input.number("year");
        int m = Input.number("month");
        int d = Input.number("date");

        YMD date = new YMD(y, m, d);

        int n = Input.number("days to calc");

        YMD d1 = date.after(n);
        System.out.printf("%d 후의 날짜는 %d.%d.%d\n", n, d1.y, d1.m, d1.d);
        
        YMD d2 = date.before(n);
        System.out.printf("%d 전의 날짜는 %d.%d.%d\n", n, d2.y, d2.m, d2.d);
    }
}
