package com.company.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Handler implements HttpHandler {
    private HttpExchange httpExchange = null;

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // save http exchange to handler property
        httpExchange = exchange;

        // enable CORS filter
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");

        if (exchange.getRequestMethod().equalsIgnoreCase("OPTIONS")) {
            exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
            exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type, Authorization");
            exchange.sendResponseHeaders(204, -1);

            return;
        }
    }

    protected String getRequest() throws IOException {
        String query;
        InputStream in = httpExchange.getRequestBody();
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            byte buf[] = new byte[4096];
            for (int n = in.read(buf); n > 0; n = in.read(buf)) {
                out.write(buf, 0, n);
            }

            query = new String(out.toByteArray(), "UTF-8");
        }
        finally {
            in.close();
        }

        return query;
    }

    protected void sendResponse(String data, int statusCode) {
        try {
            httpExchange.sendResponseHeaders(statusCode, data.length());
            OutputStream os = httpExchange.getResponseBody();
            os.write(data.getBytes("UTF-8"));
            os.close();
        } catch (IOException e) { }
    }
}