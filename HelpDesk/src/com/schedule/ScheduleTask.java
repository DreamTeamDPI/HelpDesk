package com.schedule;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Konos on 28.03.2016.
 */
import org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        String folderName = "testfolder";
        File folder = new File("C:/TMP/"+folderName );
        folder.mkdir();
        System.out.println("создана папка" + folder.getAbsolutePath().toString());
    }
}
