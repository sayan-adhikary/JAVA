class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write sometging");
    }
}

public class main {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();
    }
}


// it will not compile in that compilor
