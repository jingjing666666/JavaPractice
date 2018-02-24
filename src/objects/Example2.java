package objects;

/**
 * Created by jingjing on 2018/1/22.
 */
public class Example2 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(mOL(3));
        System.out.println(moL(3,4));
        System.out.println(moL("call"));
        person.addAge();

        System.out.println(max(2,3));
        System.out.println(max(2.3,3.1));
        System.out.println(max(2.0,2.98,2.9));
//        System.out.println();
    }
    public static int mOL(int i){
        return  i*i;
    }
    public static  int moL(int i,int j){
        return  i*j;
    }
    public static  String moL(String call){
        return "CallMOL";
    }
//    Person person = new Person();

    public  static  int max(int i,int j){
        if (i>j){
            return i;
        }
        return j;
    }
    public  static  double max(double i,double j){
        if (i>j){
            return i;
        }
        return j;
    }
    public  static  double max(double i,double j,double k){
        if (i>j){
           if (i>k){
               return  i;
           }else {
               return k;
           }
        }else if (j>k){
            return j;
        }else {
            return k;
        }
    }
}
