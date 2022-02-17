package com.example.streamsschedule.repository;

import com.example.streamsschedule.model.LiveStream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LiveStreamRepository {

    List<LiveStream> streams = new ArrayList<>();

    public LiveStreamRepository(){
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs",
                "REST API with Spring Boot",
                "https://www.twitch.tv/danvega",
                LocalDateTime.of(2022,2,16,11,0),
                LocalDateTime.of(2022,2,16,12,0)

        ));
    }

    public List<LiveStream> findAll(){
        return streams;
    }

    public LiveStream findById(String id){

        return streams.stream().filter(stream -> stream.id().equals(id)).findFirst().orElse();
    }

}
