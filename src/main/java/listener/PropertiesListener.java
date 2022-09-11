package listener;

import config.PropertiesListenerConfig;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author DELL
 * @date 2022/5/3 19:51
 */
public class PropertiesListener implements ApplicationListener<ApplicationStartedEvent> {

    private String propertyFileName;

    public PropertiesListener(String propertyFileName) {
        this.propertyFileName = propertyFileName;
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        PropertiesListenerConfig.loadAllProperties(propertyFileName);
    }
}
