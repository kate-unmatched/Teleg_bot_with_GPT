package art.vas.telegram.fact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@EnableScheduling
@SpringBootApplication
public class TelegrammFactApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelegrammFactApplication.class, args);
	}

}
