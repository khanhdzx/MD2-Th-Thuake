public class Main {
    public static void main(String[] args) {
        System.out.println("-------------SHAPE------------");
       Thuchanh shape = new Thuchanh();
        System.out.println(shape);
        shape=new Thuchanh("red",false);
        System.out.println(shape);
        System.out.println("==============CIRCLE============");
        Circle circle= new Circle(3.5);
        System.out.println(circle);
        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle(3.5,"indigo",false);
        System.out.println(circle);
    }
}