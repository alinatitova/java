package com.company;

import com.company.Collections.ItemCollection;
import com.company.models.Item;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        try {
            AppConnection.createConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

       /* try {
            System.out.println (ItemCollection.getItems());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Item item = new Item();
        item.name = "Shorts";
        item.image = "image";
        item.price = 100f;
        item.description = "jndjnd";

        item.id=4;

        try {
            ItemCollection.updateItem(item);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ItemCollection.deleteItem(4);*/

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/signin", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();

    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
