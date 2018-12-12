package com.example.nick_lund.androidnewsapp.Common;

import com.example.nick_lund.androidnewsapp.Interface.IconBetterIdeaService;
import com.example.nick_lund.androidnewsapp.Interface.NewsService;
import com.example.nick_lund.androidnewsapp.Model.IconBetterIdea;
import com.example.nick_lund.androidnewsapp.Remote.IconBetterIdeaClient;
import com.example.nick_lund.androidnewsapp.Remote.RetrofitClient;

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY="c8f360de82484152b2c3776029a6a11f";

    public static NewsService getNewsService(){
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public  static IconBetterIdeaService getIconService(){
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    public static String getAPIUrl(String source,String sortBy,String apiKEY){
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
//                .append("&sortBy=")
//                .append(sortBy)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }

}
