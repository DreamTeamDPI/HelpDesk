package com.common.helper;

import java.io.Serializable;

/**
 * Created by SemmEs on 16.03.2016.
 */
public class sortAndPage implements Serializable {

    private int page;
    private String name;
    private String sortName;

    public sortAndPage() {
        page = 1;
        name = "";
        sortName = "";
    }

    public sortAndPage(int page, String name, String sortName) {
        this.page = page;
        this.name = name;
        this.sortName = sortName;
    }

    public sortAndPage(int page, String name) {
        this.page = page;
        this.name = name;
    }

    public sortAndPage(int i) {
        this.page = i;
        this.name = "";
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public String toString() {
        return "sortAndPage{" +
                "page=" + page +
                ", name='" + name + '\'' +
                ", sortName='" + sortName + '\'' +
                '}';
    }

    public String createHref(int j) {
        return "page=" + String.valueOf(j) + "&name=" + this.name + "&sortName=" + this.sortName;
    }
}
