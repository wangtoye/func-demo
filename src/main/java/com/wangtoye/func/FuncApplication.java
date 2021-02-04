package com.wangtoye.func;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class FuncApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuncApplication.class, args);
    }

    /**
     * post/get请求
     * get请求使用/reverseStr/参数值比如 abc
     * post使用text或者json都可以
     *
     * @return 反转字符串
     */
    @Bean
    public Function<String, String> reverseStr() {
        return v -> new StringBuilder(v).reverse().toString();
    }

    /**
     * get请求
     */
    @Bean
    public Supplier<String> createStr() {
        return () -> "abc";
    }

    /**
     * post请求，text或者json都可以
     */
    @Bean
    public Consumer<String> print() {
        return System.out::println;
    }
}
