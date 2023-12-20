package org.example.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;

// https://www.digitalocean.com/community/tutorials/opencsv-csvreader-csvwriter-example
public class A {
    @Getter
    @Setter
    @CsvBindByPosition(position = 0)
    public String id;

    @Setter
    @Getter
    @CsvBindByPosition(position = 1)
    public Integer k1;

    @Override
    public String toString() {
        return "{" + id + "::" + k1 + "}";
    }
}
