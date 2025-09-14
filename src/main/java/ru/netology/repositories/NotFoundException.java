package ru.netology.repositories;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String s) {
        super(s);
    }
}