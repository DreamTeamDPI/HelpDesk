package com.db.migration;



import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Vlad Konoshenko on 11.03.2016.
 */
public class V2_01__moveDBStateToV2 implements  SpringJdbcMigration {


    public void migrate(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) throws Exception {

        jdbcTemplate.execute("INSERT INTO `helpdesk`.`user` (`firstName`, `lastName`) VALUES ('Flyway', 'Work')");
    }

}
