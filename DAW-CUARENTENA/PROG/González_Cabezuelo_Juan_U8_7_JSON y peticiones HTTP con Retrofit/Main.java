package com.juan;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*CREAMOS EL OBJETO RETROFIT PARA PODER USARLO CON LA URL BASE DADA*/
        Retrofit rf = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        Peticiones servicio = rf.create(Peticiones.class);

        System.out.println("|======================|");
        System.out.println("|==LISTA DE JUGADORES==|");
        System.out.println("|======================|");

        /*CREAMOS EL TRY CATCH CON EL QUE LANZAREMOS NUESTROS FUTBOLISTAS*/
        try {
            Response<List<Futbolista>> respuesta = servicio.listFutbolistas().execute();
            if (respuesta.isSuccessful()) {
                List<Futbolista> futbolistas = respuesta.body();
                System.out.println(futbolistas);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
