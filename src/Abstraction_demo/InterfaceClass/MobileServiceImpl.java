package Abstraction_demo.InterfaceClass;

public class MobileServiceImpl implements MobileSerivce,SiliconSerivce {
    public void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
