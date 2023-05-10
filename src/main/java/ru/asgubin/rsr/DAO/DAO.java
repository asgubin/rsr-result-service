package ru.asgubin.rsr.DAO;

import java.util.List;

public interface DAO<T> {
    List<T> getAll(String path);
}
