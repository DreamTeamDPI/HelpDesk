package com.db.migration;



import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Vlad Konoshenko on 11.03.2016.
 */
public class V2_02__moveDBStateToV2 implements  SpringJdbcMigration {


    public void migrate(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) throws Exception {

        jdbcTemplate.execute("create table ss (\n" +
                "id_user int (10) AUTO_INCREMENT,\n" +
                "name varchar(20) NOT NULL,\n" +
                "email varchar(50) NOT NULL,\n" +
                "password varchar(15) NOT NULL,\n" +
                "PRIMARY KEY (id_user)\n" +
                "); ");
    }

}
