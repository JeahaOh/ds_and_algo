import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Iterator;

class Solution {
  // public int[] solution(int[] numbers) {
    
  //   HashSet<Integer> set = new HashSet<>();
    
  //   for (int i = 0 ; i < numbers.length; i++) {
  //     for (int j = i + 1; j < numbers.length; j++) {
  //       set.add(numbers[i] + numbers[j]);
  //     }
  //   }
    
  //   ArrayList<Integer> list = new ArrayList<>(set);
  //   Collections.sort(list);
    
  //   int[] answer = new int[list.size()];
  //   for (int i = 0; i < list.size(); i++) {
  //     answer[i] = list.get(i);
  //   }
    
  //   return answer;
  // }
    
  public int[] solution(int[] numbers) {
    TreeSet<Integer> sumNumber = new TreeSet();

    for(int i = 0; i < numbers.length-1; i++){
      for(int j = i+1; j < numbers.length; j++){
        sumNumber.add(numbers[i] + numbers[j]);
      }
    }

    int[] answer = new int[sumNumber.size()];
    int index = 0;
    Iterator itor = sumNumber.iterator();
    while(itor.hasNext()){
      answer[index] = (int)itor.next();
      index++;
    }

    return answer;
  }
}