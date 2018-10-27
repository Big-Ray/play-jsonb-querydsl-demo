package controllers;

import models.Dog;
import play.mvc.Controller;
import service.dog.DogApplicationService;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import java.util.List;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void demo() {
        Dog dog = DogApplicationService.getDog();
        renderJSON(JsonbBuilder.create().toJson(dog));
    }

    public static void demo2() {
//        List<Dog> dogs = DogApplicationService.getDogs();
//        renderJSON(JsonbBuilder.create().toJson(dogs));
    }

    public static void demo3() {
        Dog dog = DogApplicationService.getOtherDog();
        JsonbConfig nillableConfig = new JsonbConfig().withNullValues(true);
        renderJSON(JsonbBuilder.create(nillableConfig).toJson(dog));
    }

    public static void demo4() {
        JsonObject json = Json.createObjectBuilder()
                .add("id", 1)
                .add("name", "toto")
                .build();
        renderJSON(json.toString());
    }

    public static void demo5() {
        JsonArray json = Json.createArrayBuilder()
                .add(1)
                .add("tutu")
                .build();
        renderJSON(json.toString());
    }

}