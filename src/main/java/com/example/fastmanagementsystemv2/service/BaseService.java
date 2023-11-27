package com.example.fastmanagementsystemv2.service;

import java.util.UUID;

public interface BaseService<T,E> {

    T add(E e);
    T update(T t);

    void delete(UUID id);

    T getById(UUID id);
}
