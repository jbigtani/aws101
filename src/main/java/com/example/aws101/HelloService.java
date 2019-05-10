package com.example.aws101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getCountryName(String code) {
        final String query = "SELECT country_name FROM country WHERE country_code = ?";
        List<String> countries = jdbcTemplate.query(query, (rs, i) -> rs.getString("country_name"), code);
        return countries.get(0);

    }
}
