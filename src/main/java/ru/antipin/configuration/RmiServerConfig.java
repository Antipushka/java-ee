package ru.antipin.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import ru.antipin.service.NameService;
import ru.antipin.service.NameServiceImpl;

@Configuration
public class RmiServerConfig {

    @Autowired
    private NameServiceImpl nameService;

    @Bean("/rmi/nameService")
    public HttpInvokerServiceExporter nameServiceHttpInvokerServiceExporter() {
        HttpInvokerServiceExporter httpInvokerServiceExporter = new HttpInvokerServiceExporter();
        httpInvokerServiceExporter.setService(nameService);
        httpInvokerServiceExporter.setServiceInterface(NameService.class);
        httpInvokerServiceExporter.afterPropertiesSet();
        return httpInvokerServiceExporter;
    }
}
