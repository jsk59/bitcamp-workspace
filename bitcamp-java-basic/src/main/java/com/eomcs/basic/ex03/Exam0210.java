package com.eomcs.basic.ex03;

class Exam0210 {
  public static void main(String[] args) {
    System.out.println(100); //10진수 리터럴, 일반적인 정수 값 표현

    System.out.println(0144); // 8진수 리터럴, 잘 사용 x,  -0으로 시작

    System.out.println(0b1100100); 
    System.out.println(0B1100100); 
      // 2진수 리터럴
      // 메모리의 상태를 직설적으로 보여주고 싶을 때 사용한다.
      // -0b, -0B로 시작한다.

    System.out.println(0b01100100);
    System.out.println(0B01100100);
      // 숫자 앞에 0이 있어도 된다!

    System.out.println(0x64);
    System.out.println(0X64);
      // 16진수 리터럴
      // 2진수를 간결하게 표현하기 위해 사용한다
      // -0x 또는 0X로 시작한다.

    System.out.println(0x064);
    System.out.println(0X064);
      // 숫자 앞에 0이 있어도 된다!


  }
}