package moduleB;
import moduleA.MyServices;
import moduleA.MyServices1;
import java.util.ServiceLoader;

public class Main{
    public static void main(String[] args){
        ServiceLoader<MyServices> Loader=ServiceLoader.load(MyServices.class);
        ServiceLoader<MyServices1> Loader1=ServiceLoader.load(MyServices1.class);
        for(MyServices service : Loader)
            System.out.println(service.getMessage());
        for(MyServices1 service : Loader1)
            System.out.println(service.getOneMsg());
    }
}