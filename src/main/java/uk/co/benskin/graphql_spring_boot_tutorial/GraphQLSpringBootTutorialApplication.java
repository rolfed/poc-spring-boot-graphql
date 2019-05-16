package uk.co.benskin.graphql_spring_boot_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uk.co.benskin.graphql_spring_boot_tutorial.resolvers.Query;

@SpringBootApplication
public class GraphQLSpringBootTutorialApplication {

    public static void main(String[] args)  {
        SpringApplication.run(GraphQLSpringBootTutorialApplication.class, args);
    }

    @Bean
    public Query query() {
        return new Query()
    }
}

