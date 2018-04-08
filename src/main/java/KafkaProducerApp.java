import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaProducerApp {
    public static void main(String[] args)
    {
        Properties props = new Properties();
        //props.put("bootstrap.servers", "BROKER-1:9092");
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer myProducer = new KafkaProducer(props);
        ProducerRecord myRecord = new ProducerRecord("my_topic", "Course-007", "My Message-7");
        ProducerRecord myRecord1 = new ProducerRecord("my_topic1", "Course-007", "My Message-7");
        myProducer.send(myRecord);
        myProducer.send(myRecord1);
    }
}
