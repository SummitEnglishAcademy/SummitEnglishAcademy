package summit_english_academy.homepage

import io.github.cdimascio.dotenv.Dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HomepageApplication

fun main(args: Array<String>) {

	val dotenv = Dotenv.configure()
		.directory("./") // .env 파일이 프로젝트 루트 디렉토리에 있을 경우
		.load()
//	val dotenv = Dotenv.load()

	// Set system properties from .env variables
	System.setProperty("SPRING_DATASOURCE_URL", dotenv["SPRING_DATASOURCE_URL"])
	System.setProperty("SPRING_DATASOURCE_USERNAME", dotenv["SPRING_DATASOURCE_USERNAME"])
	System.setProperty("SPRING_DATASOURCE_PASSWORD", dotenv["SPRING_DATASOURCE_PASSWORD"])

	runApplication<HomepageApplication>(*args)
}
