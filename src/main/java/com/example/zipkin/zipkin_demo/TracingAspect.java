package com.example.zipkin.zipkin_demo;

import brave.Span;
import brave.Tracer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TracingAspect {

    @Around("execution(* com.example.zipkin.zipkin_demo.UserController.*(..))")
    public Object traceMethod(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        String methodName = signature.getMethod().getName();
        Span span = TracerHolder.getTracer().nextSpan().name(methodName).start();
        try (Tracer.SpanInScope ws = TracerHolder.getTracer().withSpanInScope(span)) {
            return pjp.proceed();
        } finally {
            span.finish();
        }
    }
}
