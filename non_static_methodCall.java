package Practice_25Nov;

public class non_static_methodCall {
    void call1()
    {
        System.out.println("Method C1");
        call2();
    }
    void call2()
    {
        System.out.println("Method C2");
    }

    public static void main(String[] args) {
        non_static_methodCall obj = new non_static_methodCall();
        obj.call1();
    }
}
