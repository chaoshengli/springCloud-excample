package rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySlefRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule(); //指定特定LoadBalanced的算法 系统给出7个
//        return new RetryRule();、
//        return new RoundRobinRule(); //轮循，默认
        return new MyRandomRule();//用我们自定义的规则算法
    }
}
