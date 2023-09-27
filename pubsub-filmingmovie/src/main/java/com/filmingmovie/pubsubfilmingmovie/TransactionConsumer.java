package com.filmingmovie.pubsubfilmingmovie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionConsumer {
    Logger LOG = LoggerFactory.getLogger(TransactionConsumer.class);

    @KafkaListener(topics = "filmingmovie")
    void listener(String transaction) {
        LOG.info(transaction);
    }
}
