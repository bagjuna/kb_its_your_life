package org.scoula.app;

import com.mongodb.client.MongoCollection;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.scoula.domain.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;


public class App {
    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(App.class);

        MongoCollection<Todo> collection = Database.getCollection("todo", Todo.class);
//        // insertOne
//        Todo newtodo = new Todo(null, "POJO", "POJO 테스트 확인", false);
//        collection.insertOne(newtodo);
//        // insertMany
//        List<Todo> newTodos = Arrays.asList(
//                new Todo(null, "POJO2", "POJO2 테스트 확인", false),
//                new Todo(null, "POJO3", "POJO3 테스트 확인", true),
//                new Todo(null, "POJO4", "POJO4 테스트 확인", false)
//        );
//        collection.insertMany(newTodos);
//
//        // find()
//        List<Todo> todos = new ArrayList<>();
//        collection.find().into(todos);
//        for (Todo todo : todos) {
//            System.out.println(todo);
//        }

        // findOne()
        String id = "6835165db96ff701eda89e0f";
        Bson query = eq("_id", new ObjectId(id));
        Todo todo = collection.find(query).first();
//        System.out.println("==> findByIdResult : " + todo);
        log.info("==> findByIdResult : {}", todo);
        Database.close();
    }
}