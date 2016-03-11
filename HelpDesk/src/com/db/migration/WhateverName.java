package com.db.migration;

import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.api.migration.MigrationInfoProvider;
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Vlad Konoshenko on 11.03.2016.
 */

public class WhateverName implements SpringJdbcMigration, MigrationInfoProvider {

    @Override

    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
    }

    @Override
    public MigrationVersion getVersion() {

        return MigrationVersion.fromVersion("2"); //return 2 as version

    }

    @Override

    public String getDescription() {
        return "Moves DB to State Two";

    }

}

