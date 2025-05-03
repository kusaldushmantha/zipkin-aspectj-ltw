package com.example.zipkin.zipkin_demo;

import brave.Tracer;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class TracerHolder {
    @Getter
    private static Tracer tracer;

    public TracerHolder(Tracer tracer) {
        TracerHolder.tracer = tracer;
    }
}
