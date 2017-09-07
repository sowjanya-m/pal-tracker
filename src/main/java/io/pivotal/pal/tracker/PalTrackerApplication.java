package io.pivotal.pal.tracker;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

    @Autowired
    DataSource dataSource;

    @Bean
    public TimeEntryRepository timeEntryRepository() {
        return new JdbcTimeEntryRepository(dataSource);
    }
}