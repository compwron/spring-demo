package java.com.example.spring;

@SpringBootApplication
public class SpringDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDemo.class, args);
    }
}

