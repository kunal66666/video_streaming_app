package movie_streaming_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieStreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieStreamingApplication.class, args);
	}

}
