package ru.javastudy.springMVC.dao;

import ru.javastudy.springMVC.exception.DaoException;
import ru.javastudy.springMVC.model.CountryEntity;

import java.util.List;

public interface CountryDao {
    List<CountryEntity> getAll() throws DaoException;
    void update(CountryEntity countryEntity) throws DaoException;
    void delete(CountryEntity countryEntity) throws DaoException;
    void insert(CountryEntity countryEntity) throws DaoException;
}
