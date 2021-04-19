package com.example.database.entity;

import java.util.Date;

public class CloseContact {
    private Integer id;
    private Integer pId;
    private Date date;
    private Integer locId;
    private Integer casePId;

    public Integer getId() {
        return id;
    }

    public Integer getpId() {
        return pId;
    }

    public Date getDate() {
        return date;
    }

    public Integer getLocId() {
        return locId;
    }

    public Integer getCasePId() {
        return casePId;
    }
}
