public class Pitcher1 implements BodySign1 {
       //인터페이스의 추상 메서드 구현
       public void throwBall(int how){
           if(how == BodySign1.CENTER){
               System.out.println("Center로 던집니다.");
           }else if(how == BodySign1.LEFT){
               System.out.println("Left로 던집니다.");
           }else if(how == BodySign1.RIGHT){
               System.out.println("Right로 던집니다.");
           }else if(how == BodySign1.DOWN){
               System.out.println("Down으로 던집니다.");
           }else if(how == BodySign1.UP){
               System.out.println("Up으로 던집니다.");
           }else{
               System.out.println("이상한 볼입니다.");           }

       }
           public static void main(String[] args){
               Pitcher1 p = new Pitcher1(); //객체 생성
               //1. static final 변수를 이용
               p.throwBall(BodySign1.CENTER); //final static 변수를 사용
               p.throwBall(BodySign1.LEFT); //final static 변수를 사용
               p.throwBall(BodySign1.RIGHT); //final static 변수를 사용
               p.throwBall(BodySign1.DOWN); //final static 변수를 사용
               p.throwBall(BodySign1.UP); //final static 변수를 사용

               //2. 상수 자체를 이용하는 예
               p.throwBall(1);
               p.throwBall(2);
               p.throwBall(3);
               p.throwBall(4);
               p.throwBall(5);
               p.throwBall(1000); //임의의 수를 이용
           } //end of main
       } //end of Pitcher class
