package dtos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokeDTO {
//    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    String name;
    String joke;

    public JokeDTO(String name, String joke) {
        this.name = name;
        this.joke = joke;
    }

//    public void setJoke(String joke) {
//        this.joke = joke;
//    }

    @Override
    public String toString() {
        return "JokeDTO{" +
                "name='" + name + '\'' +
                ", joke='" + joke + '\'' +
                '}';
    }
}
