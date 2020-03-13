package com.wish.api;

import java.util.List;

public interface BaseService<T> {

   List<T> getAll();

    T getById(Integer id);
}
