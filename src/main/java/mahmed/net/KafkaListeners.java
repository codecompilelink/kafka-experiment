package mahmed.net;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	
	@KafkaListener(
		topics="testmessages",
		groupId = "groupId"
	)
	void listener(String message)
	{
		System.out.print("Kafka listener received " + message);
	}

}
