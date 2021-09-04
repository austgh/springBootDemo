package com.example.demo.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author think
 * @Date 2021/7/13 16:11
 * @Version 1.0
 */
//@Configuration
//@MapperScan(basePackages = "com.example.demo.mapper.tdqs",sqlSessionFactoryRef = "tdqsSqlSessionFactory")
public class DataSourceConfig2 {
    private Logger logger = LoggerFactory.getLogger(DataSourceConfig2.class);
    @Bean(name = "tdqsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.tdqs")
    public DataSource getDataSource2(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "tdqsSqlSessionFactory")
    public SqlSessionFactory hshySqlSessionFactory(@Qualifier("tdqsDataSource") DataSource dataSource) throws Exception {
        logger.info("查询到的数据源连接池信息是：" + dataSource);
        logger.info("查询到的数据源连接池类型是：" + dataSource.getClass());

        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapping/tdqs/*.xml"));
        return bean.getObject();
    }
    @Bean(name = "tdqsSqlSessionTemplate")
    public SqlSessionTemplate hshysqlsessiontemplate(@Qualifier("tdqsSqlSessionFactory") SqlSessionFactory sessionFactory){
        return new SqlSessionTemplate(sessionFactory);
    }
}
