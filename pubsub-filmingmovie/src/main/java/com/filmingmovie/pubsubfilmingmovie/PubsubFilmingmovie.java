package com.filmingmovie.pubsubfilmingmovie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PubsubFilmingmovie {
    Logger LOG = LoggerFactory.getLogger(PubsubFilmingmovie.class);

    @KafkaListener(topics = "Filmingmovie")
    void listener(String transaction) {
        LOG.info(transaction);
    }
}
