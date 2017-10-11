package designPattern.singleton;

public class SingletonDemo {
	public SingletonDemo()
    {
    }

    public static void main(String args[])
    {
        Singleton firstInstance = Singleton.getInstance();
        System.out.println((new StringBuilder("first instance: ")).append(firstInstance).toString());
        firstInstance.showMessage();
        Singleton secondInstance = Singleton.getInstance();
        System.out.println((new StringBuilder("second instance: ")).append(secondInstance).toString());
        secondInstance.showMessage();
    }
}