package do_it.chap03._08.EX;

import do_it.Input;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 연습 3 - 7
 * 시력을 내림차순으로 정렬한 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는 프로그램.
 */
public class PhysExamSearchV {

  // 신체 검사 데이터
  static class PhyscData {
    private String name;
    private int height;
    private double vision;
    
    public PhyscData(String name, int height, double vision) {
      this.name = name;
      this.height = height;
      this.vision = vision;
    }

    public String toString() {
      return this.name + " " + height + " " + vision;
    }
  
    // 내림차순 컴퍼레이터
    public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

    private static class VisionOrderComparator implements Comparator<PhyscData> {
      public int compare(PhyscData d1, PhyscData d2) {
        return (d1.vision > d2.vision)
              ? 1
              : (d1.vision < d2.vision)
                ? -1
                : 0;
      }
    }
  }

  public static void main(String[] args) {
    // 배열 요소는 시력 오름차순으로 정렬
    PhyscData[] x = {
      new PhyscData("강민하", 162, 0.3),
      new PhyscData("이수연", 168, 0.4),
      new PhyscData("김찬우", 173, 0.7),
      new PhyscData("황지안", 169, 0.8),
      new PhyscData("장경오", 174, 1.2),
      new PhyscData("유서범", 171, 1.5),
      new PhyscData("박준서", 175, 2.0),
    };

    double vision = Input.aDouble("vision");

    int idx = Arrays.binarySearch(
      x,
      new PhyscData("", 0, vision),
      PhyscData.VISION_ORDER
    );

    if (idx < 0)
      System.out.println("X");
    else
      System.out.println("x[" + idx + "]");
      System.out.println(x[idx]);
  }
}
