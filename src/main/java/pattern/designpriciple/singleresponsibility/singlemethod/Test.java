package it.caoxin.designpriciple.singleresponsibility.singlemethod;

public class Test {
    //将修改名字和修改地址的函数分开
//    public static void test(String name,String address ,boolean flag){
//       name = "xxxx";
//       address = "xxxxxx";
//    }

    public static void updateUserInfo(String username){
        username = "caoxin";
    }

    public static void updateUserAddress(String address){
        address = ",x,x,x,,x,x,";
    }

}
