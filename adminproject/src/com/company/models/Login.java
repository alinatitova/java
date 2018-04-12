package com.company.models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Login {
    public String login;
    public String password;

    public static Login parse(String json) throws ParseException {
        Login login = new Login();

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(json);

        login.login    = jsonObject.get("login").toString();
        login.password = jsonObject.get("password").toString();

        return login;
    }
}