package ru.antipin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import ru.antipin.service.NameService;

@Configuration
public class RmiClientConfig {

    @Bean
    public NameService rmiNameService() {
        HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean();
        httpInvokerProxyFactoryBean.setServiceInterface(NameService.class);
        httpInvokerProxyFactoryBean.setServiceUrl("http://localhost:8080/rmi/nameService");
        httpInvokerProxyFactoryBean.afterPropertiesSet();
        return (NameService) httpInvokerProxyFactoryBean.getObject();
    }
}
