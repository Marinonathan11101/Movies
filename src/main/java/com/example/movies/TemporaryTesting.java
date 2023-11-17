package com.example.movies;

import java.io.IOException;

public class TemporaryTesting {
    public static void main(String[] args) throws IOException, InterruptedException {

        try {
            APIUtility.callAPI("The dark knight");
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
