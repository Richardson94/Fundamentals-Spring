package mx.com.gm.util;

public class EncriptPassword {
    public static void main(String[] args){

        var password = "123";
        System.out.println("password:"+password);
        System.out.println("password encrypted:"+encryptPassword(password));
    }
    public static encryptPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
