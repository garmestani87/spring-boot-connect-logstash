package com.garm.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private final Project project = new Project();
    private final Logging logging = new Logging();

    @Getter
    @Setter
    public static class Project {
        private String version;
    }

    @Getter
    public static class Logging {

        private final Logstash logstash = new Logstash();

        @Getter
        @Setter
        public static class Logstash {
            private boolean enabled;
            private String host;
            private int port;
            private int queueSize;
        }

    }
}
