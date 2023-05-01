//working of user defined generic class


package org.example.javapractice.generic;
class Test <T, U> {

    T obj1;
    U obj2;

    Test(  T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public T getObj1(){

        return this.obj1;
    }

    public U getObj2() {

        return this.obj2;
    }
}
public class GenericCode {

    public static void main(String[] args) {

        Test <String, Integer> ob = new Test<String, Integer>("Shweta", 20);
        ob.print();
        System.out.println(ob.getObj1());
        System.out.println(ob.getObj2());
    }

}
