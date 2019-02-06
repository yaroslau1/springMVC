package com.work.dao;

import com.work.exception.DaoException;
import com.work.model.CountryEntity;

import java.util.List;

public interface CountryDao {
    List<CountryEntity> getAll() throws DaoException;
    void update(CountryEntity countryEntity) throws DaoException;
    void delete(CountryEntity countryEntity) throws DaoException;
    void insert(CountryEntity countryEntity) throws DaoException;
}
