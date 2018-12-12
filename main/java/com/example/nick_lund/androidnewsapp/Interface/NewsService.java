package com.example.nick_lund.androidnewsapp.Interface;

import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Url;

import com.example.nick_lund.androidnewsapp.Common.Common;
import com.example.nick_lund.androidnewsapp.Model.Website;
import com.example.nick_lund.androidnewsapp.Model.News;

public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<Website> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
