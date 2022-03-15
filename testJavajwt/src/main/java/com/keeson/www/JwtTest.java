package com.keeson.www;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;


public class JwtTest {

    public static void main(String[] args) {
        String Secret = "secret";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("sercet")).build();
        // 解析指定的token
        DecodedJWT decodedJWT = jwtVerifier.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJrZWVzb24iLCJpYXQiOjE2NDczMTEyODIsImV4cCI6MTY0ODYwNzI4MiwiYWNjb3VudCI6IjE5ODE3MDg4NDc3IiwiYXBwSWQiOiJreTdrZjBTR2VWa29MTm8zZGIzZDZiNWwyQkE2QkV5ciJ9.LVhW45v_rpA5zMBeG0lIlvx10NwyNvMPW0vNkH9fbi4");
        System.out.println(decodedJWT);

    }
}
