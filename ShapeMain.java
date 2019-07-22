abstract class Shape {
       public abstract void draw();
       public abstract void delete();
   } //end of Shape abstract class
   class Circle extends Shape {
       public void draw(){
           System.out.println("���� �׸��ϴ�");    
       }
      public void delete(){
           System.out.println("���� ����ϴ�");    
       }
   } //end of Circle class


  class Triangle extends Shape {
       public void draw(){
           System.out.println("�ﰢ���� �ϳ�, ��, ��, �׸��ϴ�.");    
       }
       public void delete(){
           System.out.println("�ﰢ���� ����ϴ�");    
       }
   } //end of Triangle class

   class Rectangle extends Shape {
       public void draw(){
           System.out.println("�簢���� ��, ��, ����, �� �׸��ϴ�.");    
       }
       public void delete(){
           System.out.println("�簢���� ����ϴ�");    
       }
   } //end of Rectangle class

   public class ShapeMain {
       public static void main(String[] args){
           Circle c = new Circle();
           Triangle t = new Triangle();
           Rectangle r = new Rectangle();
           //1. ������ ���� �׸���
           c.draw();
           t.draw();
           r.draw();
           //2. ������ ���� �����
           c.delete();
           t.delete();
           r.delete();
       } //end of main
   } //end of ShapeMain class
