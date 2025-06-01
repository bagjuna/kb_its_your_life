package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack 컬렉션 생성
        Stack<Coin> stack = new Stack<Coin>();
        //Coin 객체 푸시
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(500));
        stack.push(new Coin(10));

        //스택에서 코인 꺼내기
        while (!stack.isEmpty()) {
            Coin coin = stack.pop();
            System.out.println(coin.getValue() + "원 꺼내기");
        }
    }

}