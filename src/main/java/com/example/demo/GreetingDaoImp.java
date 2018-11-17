package com.example.demo;

import com.google.cloud.datastore.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class GreetingDaoImp implements GreetingDao {

    private final Datastore datastore = DatastoreOptions.getDefaultInstance().getService();

    public Response getResponse() {
        Key messageKey = datastore.newKeyFactory().setKind("Message").newKey(5700305828184064L);
        Query<Entity> query =
                Query.newEntityQueryBuilder().setKind("Message").setFilter(StructuredQuery.PropertyFilter.eq("__key__", messageKey)).build();
        QueryResults<Entity> queryResults = datastore.run(query);
        return new Response(queryResults.next().getString("greeting"));
    }
}
