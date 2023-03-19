package com.learningspringboot.ch2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.learningspringboot.ch2.entity.Video;

@Service
public class VideoService {
    private List<Video> videos = List.of(
        new Video("Need help with your Spring Boot 3 App?"),
        new Video("Don't do THIS to your own code!"),
        new Video("Secrets to fix broken code!")
    );

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }
}
