package util;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil
{
    private static SqlSessionFactory sqlsessionFactory = null;
    static
    {
        try
        {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e)
        {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SqlSessionFactory getSessionFactory()
    {
        return sqlsessionFactory;
    }

    public static SqlSession getSqlSession()
    {
        return sqlsessionFactory.openSession();
    }

    public static void closeSqlSession(SqlSession sqlSession)
    {
        if(sqlSession != null)
        {
            sqlSession.close();
        }
    }
}
