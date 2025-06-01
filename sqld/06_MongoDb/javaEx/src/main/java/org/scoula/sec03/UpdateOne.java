package org.scoula.sec03;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.scoula.app.Database;

import static com.mongodb.client.model.Filters.eq;
import static org.scoula.app.Database.*;

public class UpdateOne {
    public static void main(String[] args) {
        MongoCollection<Document> collection = getCollection("users");
        String id = "6835107fdeb5b3242558ae6e";
        Bson query = eq("_id", new ObjectId(id));
        Bson updates = Updates.combine(
                Updates.set("name", "modify name"),
                Updates.currentTimestamp("lastUpdated"));
        UpdateResult result = collection.updateOne(query, updates);
        System.out.println("==> UpdateResult : " + result.getModifiedCount());
        close();
    }
}