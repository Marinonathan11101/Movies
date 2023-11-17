package com.example.movies;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    /**
     * This method will call the OMOB API with a movie title passed in as an argument
     */
    public static void callAPI(String movieName) throws IOException, InterruptedException {
        //if we recieved "star Wars ", we need to translate that to be "Star%20Wars"

        movieName = movieName.replaceAll(" ","%20");

        String uri = "https://www.omdbapi.com/?i=tt3896198&apikey=b18be9de&s="+movieName;

        //configure the environemnt to make a HTTP request (this includes an update to the module-info.java file
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //This will save a file called movies.json with the API's repsonse
        HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofFile(Paths.get("movies.json")));
    }

}
