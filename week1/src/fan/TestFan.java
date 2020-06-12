package fan;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.getFAST());
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan2.setSpeed(fan2.getMEDIUM());
        System.out.println("Fan1:");
        System.out.println(fan1.toString());
        System.out.println("Fan2:");
        System.out.println(fan2.toString());
    }
}
