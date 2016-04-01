/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;


/**
 *
 * @author SEMEN
 */
@Configuration
@Import({ThymeleafConfig.class, DataConfig.class, SecurityConfiguration.class, ScheduleConfig.class})
@ComponentScan("com.common.service.*")
public class AppConfig {


}
