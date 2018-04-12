package com.company.handler;

import com.company.Collections.ItemCollection;
import com.company.handler.Handler;
import com.company.models.Item;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.SQLException;

public class AddItemHandler extends Handler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        super.handle(httpExchange);

        String request = getRequest();

        Item item = new Item();
        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(request);

            item.description = jsonObject.get("description").toString();
            item.image = jsonObject.get("image").toString();
            item.name = jsonObject.get("name").toString();
            item.price = Integer.parseInt(jsonObject.get("price").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            sendResponse("Invalid input data", 400);
            return;
        }


        try {
            long id=ItemCollection.addItem(item);
            sendResponse (String.valueOf(id), 200);
        } catch (SQLException e) {
            e.printStackTrace();
            sendResponse("Error!",400);
        }
    }
}