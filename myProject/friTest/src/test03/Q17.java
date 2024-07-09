package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("숫자1 입력>> ");
        int num1 = reader.read() - '0';
        reader.readLine();  // 남아있는 엔터 키 처리
        
        System.out.print("숫자2 입력>> ");
        int num2 = reader.read() - '0';
        reader.readLine();  // 남아있는 엔터 키 처리

        System.out.println("두 숫자의 합은 " + (num1 + num2) +
                " 이고 차는 " + (num1 - num2) + "이며 곱은 " + (num1 * num2) + 
                " 나눈 값은 " + (num1 / num2) + " 나눗셈의 나머지는 " + (num1 % num2) + "입니다.");
    }
}
