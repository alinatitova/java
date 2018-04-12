package com.company.models;

import org.json.simple.JSONObject;

public class Item {
    public int id;
    public String name;
    public float price;
    public String description;
    public String image;

    public JSONObject toJSON(){
        JSONObject obj=new JSONObject();
        obj.put("id", id);
        obj.put("name",name);
        obj.put("price", price);
        obj.put("description", description);
        obj.put("image", image);
        return obj;

    }
}
