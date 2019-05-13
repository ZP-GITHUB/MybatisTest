package com.zp.Server.test;

import com.zp.Server.Dao.AccountDao;
import com.zp.Server.Dao.HeadPictureDao;
import com.zp.Server.model.Account;
import com.zp.Server.model.HeadPicture;
import com.zp.Server.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by ZP on 2019/2/12.
 */
public class ZPTest {

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testGetHeadppicture() throws IOException {

        // 1、获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 2、获取sqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession();
        HeadPictureDao mapper = openSession.getMapper(HeadPictureDao.class);

        List<HeadPicture> lhp = mapper.getHeadPicture();
        if(lhp.size()>0){
            HeadPicture hpe = lhp.get(0);
            //out.write(hp.toString().getBytes("UTF-8"));
            System.out.println(hpe.toString());
            System.out.println(hpe.getNickname()+","+hpe.getPictureLink());
        }else{
            System.out.println("没有Owner为空的头像了");
        }

        openSession.close();


    }

    @Test
    public void testaddOwnerByNickname() throws IOException {
        // 1、获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 2、获取sqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession(true);
        HeadPictureDao mapper = openSession.getMapper(HeadPictureDao.class);

        Date insert_time = new Date();
        int flag = mapper.addOwnerByNickname("aa",insert_time,"bb");
        if(flag>0){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
//        openSession.commit();
        openSession.close();
    }

    @Test
    public void testdelet() throws IOException {
        // 1、获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 2、获取sqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession();
        HeadPictureDao mapper = openSession.getMapper(HeadPictureDao.class);

        int flag = mapper.delOwnerByNickname("bb");
        System.out.println(flag);

        openSession.commit();
        openSession.close();
    }

//    使用mybatisutil测试
    private SqlSession openSession = MyBatisUtil.getSession();;
    private HeadPictureDao mapper = openSession.getMapper(HeadPictureDao.class);
    @Test
    public void testgetbyutil(){
        List<HeadPicture> lhp = mapper.getHeadPicture();
        if(lhp.size()>0){
            HeadPicture hpe = lhp.get(0);
            //out.write(hp.toString().getBytes("UTF-8"));
            System.out.println(hpe.toString());
            System.out.println(hpe.getNickname()+","+hpe.getPictureLink());
        }else{
            System.out.println("没有Owner为空的头像了");
        }
//        MyBatisUtil.closeSession();
    }

    @Test
    public void test(){
        MyBatisUtil.closeSession();
    }

    @Test
    public void testupdatabyutil(){
        Date time = new Date();
        int flag = mapper.addOwnerByNickname("zp",time,"aa");
        System.out.println(flag);
        MyBatisUtil.closeSession();
    }

    @Test
    public void testdeletbyutil(){
        int flag = mapper.delOwnerByNickname("bb");
        System.out.println(flag);
        MyBatisUtil.closeSession();
    }

    @Test
    public void testaddpic(){
        HeadPicture hp = new HeadPicture();
        hp.setNickname("cc");
        hp.setPictureLink("www.baidu.com");
        int flag = mapper.addpic(hp);
        System.out.println(flag);
        MyBatisUtil.closeSession();
    }

    private AccountDao ad = openSession.getMapper(AccountDao.class);
    @Test
    public void testgetAccountByID(){
        Account ac = ad.getAccountByID("3IjhiryNtL2MvQQ");
        System.out.println(ac.toString());
        MyBatisUtil.closeSession();
    }
}
