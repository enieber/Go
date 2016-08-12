package com.example.enieber.go.data.db.dao.impl;


import android.database.SQLException;

import com.example.enieber.go.data.db.dao.CityDao;
import com.example.enieber.go.model.City;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

public class CityDaoImpl extends BaseDaoImpl<City, Integer> implements CityDao {

    public CityDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, City.class);
    }

}