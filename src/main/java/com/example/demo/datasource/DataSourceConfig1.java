package com.example.demo.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author think
 * @Date 2021/7/13 16:11
 * @Version 1.0
 */
//@Configuration
//@MapperScan(basePackages = "com.example.demo.mapper.hshy",sqlSessionFactoryRef = "hshySqlSessionFactory")
public class DataSourceConfig1 {
    @Bean(name = "hshyDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.hshy")
    public DataSource getDataSource1(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "hshySqlSessionFactory")
    @Primary
    public SqlSessionFactory hshySqlSessionFactory(@Qualifier("hshyDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapping/hshy/*.xml"));
        return bean.getObject();
    }
    @Bean(name = "hshySqlSessionTemplate")
    public SqlSessionTemplate hshysqlsessiontemplate(@Qualifier("hshySqlSessionFactory") SqlSessionFactory sessionFactory){
        return new SqlSessionTemplate(sessionFactory);
    }
}
