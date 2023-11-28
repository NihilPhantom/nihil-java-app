package com.nihil.common.auth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Authority {
    String Id;
    Map<String, Object> info;
    List<Integer> authorityList;

    public Authority(){
        info = new HashMap<>();
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Object get(String s) {
        return this.info.get(s);
    }

    public void set(String s, Object o) {
        this.info.put(s, o);
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    public List<Integer> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<Integer> authorityList) {
        this.authorityList = authorityList;
    }
}