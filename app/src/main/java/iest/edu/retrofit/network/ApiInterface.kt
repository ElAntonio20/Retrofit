package iest.edu.retrofit.network

import iest.edu.retrofit.models.ImageRandom
import iest.edu.retrofit.models.ListBreed
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("breeds/image/random")
    fun imagenAleatoria(): Call<ImageRandom>

    @GET("breed/{raza}/images")
    fun ListaImageneDePerrosPorRaza(@Path("raza")raza: String): Call<ListBreed>
    //Si raza= "CHICHUCHUA" url seria breed)chichuachua/images
    //si raza es = "pastor" url seria breed/pastor/images

}