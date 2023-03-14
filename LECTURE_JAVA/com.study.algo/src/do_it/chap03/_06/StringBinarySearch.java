package do_it.chap03._06;

import java.util.Arrays;
import java.util.Scanner;

// 문자열 배열에서 검색
public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 자바에서 사용하는 키워드
        String[] x = {
            "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else",
                "enum", "extends", "final", "finally", "float",
                "for", "goto", "if", "implements", "import",
                "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public",
                "return", "sort", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while"
        };
        
        System.out.print("KEYWORD : ");
        String key = sc.next();
        
        // 배열 X 에서 값이 key인 요소 검색
        int idx = Arrays.binarySearch(x, key);
        
        if (idx < 0)
            System.out.println("X");
        else
            System.out.println("x[" + idx + "]");
    }
}
