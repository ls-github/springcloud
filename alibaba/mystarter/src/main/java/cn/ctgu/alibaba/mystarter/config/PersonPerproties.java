package cn.ctgu.alibaba.mystarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix=PersonPerproties.PREFIX)
public class PersonPerproties {
    public static final String PREFIX = "person";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
