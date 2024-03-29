package br.com.esmaelgoncalves.ribbonserver.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfig {

    @Autowired
    private IClientConfig ribbonClientConfig;

    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new NoOpPing();
    }

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RoundRobinRule();
    }
}
