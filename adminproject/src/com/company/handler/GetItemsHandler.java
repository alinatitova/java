package com.company.handler;

import com.company.Collections.ItemCollection;
import com.company.models.Category;
import com.company.models.Item;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetItemsHandler extends Handler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        super.handle(httpExchange);

        System.out.print(httpExchange.getRequestHeaders().getFirst("Authorization"));


        /* TODO: GET ITEMS HERE */

        try {
            ArrayList<Item> items = ItemCollection.getItems();
            // convert items list to json object
            JSONArray itemsJSON = new JSONArray();
            for (Item item : items) {
                itemsJSON.add(item.toJSON());
            }

            JSONObject response = new JSONObject();
            response.put("items", itemsJSON);

            sendResponse(response.toJSONString(), 200);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
