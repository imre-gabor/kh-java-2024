package com.example.consumer;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class WordCountStream {

    @Autowired
    public void buildStream(StreamsBuilder builder) {
        KStream<String, String> textLines = builder.stream("TextTopic", Consumed.with(Serdes.String(), Serdes.String()));

        KTable<String, Long> wordCounts = textLines.flatMapValues(text -> Arrays.asList(text.toLowerCase().split("\\W+")))
                .groupBy((key, word) -> word)
                .count(Materialized.as("counts-store"));

        wordCounts
                .toStream()
                .to("WordCountsTopic", Produced.with(Serdes.String(), Serdes.Long()));
    }

}
