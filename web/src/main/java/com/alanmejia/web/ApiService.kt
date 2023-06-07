package com.alanmejia.web

import retrofit2.http.GET

interface ApiService {

    @GET(ApiConstants.BASE_URL_PARAMS + "/pokemon")
    suspend fun getPokemons()
}