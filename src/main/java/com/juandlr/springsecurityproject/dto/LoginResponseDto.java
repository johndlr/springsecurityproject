package com.juandlr.springsecurityproject.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Login Response", description = "Schema to hold the jwt information")
public record LoginResponseDto(@Schema(description = "Represent the JWT generated by the server", example = "eyJhbGciOiJIUzI1NiJ9." +
                "eyJpc3MiOiJjb20uanVhbmRsciIsInN1YiI6ImJydWNlYmFubmVyIiwicm9sZSI6IlJ" +
                "PTEVfVVNFUiIsImlhdCI6MTcyOTgwNjA4MCwiZXhwIjoxNzI5ODA2NjgwfQ." +
                "vw8iQkdnhakqVsfdi8mQUdpSUIAtczNKg8sRh5U8YX4")String jwt)
{

}
