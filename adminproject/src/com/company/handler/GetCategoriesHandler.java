package com.company.handler;

import com.company.models.Category;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class GetCategoriesHandler extends Handler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        super.handle(httpExchange);

        System.out.print(httpExchange.getRequestHeaders().getFirst("Authorization"));


        /* TODO: GET CATEGORIES HERE */

        ///////////////
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Category 1"));
        categories.add(new Category(2, "Category 2"));
        ///////////////

        // convert categories list to json object
        JSONArray categoriesJSON = new JSONArray();
        for (Category category : categories) {
            categoriesJSON.add(category.toJSON());
        }

        JSONObject response = new JSONObject();
        response.put("categories", categoriesJSON);

        sendResponse(response.toJSONString(), 200);
    }
}