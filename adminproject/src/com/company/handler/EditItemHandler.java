package com.company.handler;

import com.company.handler.Handler;
import com.company.models.Item;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class EditItemHandler extends Handler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        super.handle(httpExchange);

        String request = getRequest();

        Item item = new Item();
        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(request);

            item.id = (Integer)jsonObject.get("id");
            item.description = jsonObject.get("description").toString();
            item.image = jsonObject.get("image").toString();
            item.name = jsonObject.get("name").toString();
            item.price = (Float)jsonObject.get("price");
        } catch (ParseException e) {
            sendResponse("Invalid input data", 400);
            return;
        }

        /* TODO: change item in db */

        sendResponse("Edit item success!", 200);
    }
}
