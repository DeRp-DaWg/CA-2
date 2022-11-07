package fetcher;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dtos.JokeDTO;
import utils.HttpUtils;

import java.util.concurrent.Callable;

public class CallableJoke implements Callable<JokeDTO>{
    String url;
    String name;

    String nameOfValue;
    //List<String>

    public CallableJoke(String url, String name, String nameOfValue) {
        this.url = url;
        this.name = name;
        this.nameOfValue = nameOfValue;
    }

    @Override
    public JokeDTO call() throws Exception {
        String fetchedData = HttpUtils.fetchData(this.url);
        JsonObject jobj = new Gson().fromJson(fetchedData, JsonObject.class);
        JokeDTO jokeDTO = new JokeDTO(this.name, jobj.get(this.nameOfValue).getAsString());
        return jokeDTO;
    }
}
