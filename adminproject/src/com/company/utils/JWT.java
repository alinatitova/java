package com.company.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JWT {

    public static String createJWT(String id, String issuer, String subject, long ttlMillis) {
        String jwt = null;

        try {
            jwt = Jwts.builder()
                    .setSubject(subject)
                    .setExpiration(new Date(System.currentTimeMillis() + ttlMillis))
                    .setIssuer(issuer)
                    .claim("id", id)
                    .signWith(
                            SignatureAlgorithm.HS256,
                            "secret".getBytes("UTF-8")
                    )
                    .compact();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jwt;
    }
}