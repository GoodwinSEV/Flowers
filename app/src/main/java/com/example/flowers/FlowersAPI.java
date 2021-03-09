package com.example.flowers;

public interface FlowersAPI {
    @GET("feeds/flowers.json")
    CALL<List<Flower>> getData();


}
