package com.example.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class RxJava3Test {

    public static void main(String[] args) {
        Observable.just("hello", "world").subscribe(System.out::println);
    }
}
