package org.example.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;

public class B {
    @Getter
    @Setter
    @CsvBindByPosition(position = 0)

    public String id;
    @Getter
    @Setter
    @CsvBindByPosition(position = 1)
    public Integer k3;
    @Getter
    @Setter
    @CsvBindByPosition(position = 2)
    public Integer k4;

    @Override
    public String toString() {
        return "{" + id + "::" + k3 + "::" + k4 + "}";
    }
}
