package com.zp.Server.util;

/**
 * Created by ZP on 2019/2/13.
 */
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class c3p0DataSourceFactory extends UnpooledDataSourceFactory{
    public c3p0DataSourceFactory(){
        this.dataSource=new ComboPooledDataSource();
    }
}
