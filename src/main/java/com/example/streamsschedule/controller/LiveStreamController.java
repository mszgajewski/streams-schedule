package com.example.streamsschedule.controller;

import com.example.streamsschedule.model.LiveStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    @GetMapping
    public List<LiveStream> findAll() {
        return null;
    }

}
