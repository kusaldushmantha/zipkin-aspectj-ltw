package com.example.zipkin.zipkin_demo;

import brave.Tracer;

public class TracerHolder {
    private static final ThreadLocal<Tracer> tracerThreadLocal = new ThreadLocal<>();

    public static void setTracer(Tracer tracer) {
        tracerThreadLocal.set(tracer);
    }

    public static Tracer getTracer() {
        return tracerThreadLocal.get();
    }

    public static void clear() {
        tracerThreadLocal.remove();
    }
}
