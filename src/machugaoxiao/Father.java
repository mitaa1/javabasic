package machugaoxiao;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Father {
    protected Number doSomething(int a,Integer b,Object c)throws SQLException{
        System.out.println("Father do");
        return new Integer(7);
    }
    class son extends Father{
        /**
         * 1.权限扩大，由protectd到public
         * 2.返回值是父类的Number的子类
         * 3.抛出异常是SQLException的子类
         * 4.方法名必须严格一致
         * 5.参数类型与个数必须严格一致
         * 6.必须加@override
         */

         @Override
        public Integer doSomething(int a,Integer b,Object c)throws SQLClientInfoException{
            if (a==0){
                throw new SQLClientInfoException();
            }
            return new Integer(17);
        }
    }
}
