package do_it.chap03._08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 실습 3 - 8
 */
public class PhysExamSearch {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;
        
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    
        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }
        
        // 키의 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
        
        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PhyscData[] x = {
                new PhyscData("A", 162, 0.3),
                new PhyscData("B", 122, 0.4),
                new PhyscData("C", 169, 0.8),
                new PhyscData("D", 171, 1.5),
                new PhyscData("E", 173, 0.7),
                new PhyscData("F", 174, 1.2),
                new PhyscData("G", 175, 2.0),
        };
        
        System.out.print("height?");
        int height = sc.nextInt();
        
        int idx = Arrays.binarySearch(
                x,
                new PhyscData("", height, 0.0),
                PhyscData.HEIGHT_ORDER
        );
        
        if (idx < 0)
            System.out.println("X");
        else {
            System.out.println("x[" + idx + "]");
            System.out.println(x[idx]);
        }
    }
}
