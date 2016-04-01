package com.common.config;

import com.schedule.ScheduleTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;

import javax.ejb.Schedule;

/**
 * Created by Konos on 28.03.2016.
 */

@Configuration
@EnableScheduling
public class ScheduleConfig {

    @Bean
    public ScheduleTask scheduleTask(){
        return new ScheduleTask();
    }
}
