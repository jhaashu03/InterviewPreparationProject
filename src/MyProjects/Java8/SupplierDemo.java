package MyProjects.Java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public  static void main(String args[]){
        //accpet no parameter and return is R, it doesn't have biSupplier method
        Supplier<String> s = ()->{
            String otp="";
            for(int i=0;i<6;i++){
                otp+=(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("Your 6 digit OTP is: "+s.get());

        Supplier<Date> s1 = ()->new Date();
        System.out.println(s1.get());
    }
}
