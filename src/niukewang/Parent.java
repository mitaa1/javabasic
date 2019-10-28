package niukewang;

public  class Parent {
    public float aFun(float a,float b){
       return 1;
    }
}
class Child extends Parent{
    /**
     * 不对，这属于override,但是子类访问修饰符必须比父类更加开放
    float aFun(float a,float b){
        return 1;
    }
     */
    /**
     * 如果子类中方法与父类方法具有相同的方法名和参数，就说明必须是override,那么返回值类型和ACSESS——FLAG必须比父类更开放
     * int 报错
    @Override

    public int aFun(float a,float b){
        return 1;
    }
    */
    //普通方法
    public int aFun(int a,int b){
        return 1;
    }
    @Override

    public float aFun(float p,float q){
        return 1;
    }
}