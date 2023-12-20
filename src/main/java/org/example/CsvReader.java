package org.example;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader<T> {
    public List<T> csvToBean(InputStream csv, Class<T> clazz) {
        CsvToBean<T> cb = new CsvToBeanBuilder<T>(new InputStreamReader(csv))
                .withType(clazz)
                .build();

        return cb.parse();
    }
}
