package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import model.Any;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import utils.JWTUtils;

import java.util.HashMap;
import java.util.Map;

public class JSONController extends Controller {

    public Result usingMap(){
        Map<String, Object> result = new HashMap<String, Object>(){
            {
                put("name", "LavaOne 2018");
                put("track", "Unique");
                put("talk", "RESTful services withPlay Framework");
                put("schedule", "Tuesday 12");
            }
        };
        return ok(Json.toJson(result));
    }

    public Result returnObj(){
        Any any = new Any("LavaOne 2018", 15);
        return ok(Json.toJson(any));
    }

    public Result catchObj(){
        JsonNode jsonNode = request().body().asJson();
        Any any = Json.fromJson(jsonNode, Any.class);

        return ok(Json.toJson(any));
    }

    public Result returnToken(){
        Any any = new Any("HEY THAT A REST API WITh JWT", 14);
        System.out.println("TOKEN ====> "+JWTUtils.generateJWT(any));
        return ok(JWTUtils.generateJWT(any));
    }

    public Result validateToken(){
        String token = request().body().asText();
        System.out.println("TOKEN : "+token);
        return ok("Is token valid : "+JWTUtils.validateJWT(token));
    }
}
