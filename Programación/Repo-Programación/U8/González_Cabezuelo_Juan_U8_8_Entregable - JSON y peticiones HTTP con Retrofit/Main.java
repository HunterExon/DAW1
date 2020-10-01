package com.juan;
import com.juan.Futbolista;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*CREAMOS EL OBJETO RETROFIT PARA PODER USARLO CON LA URL BASE DADA*/
        Retrofit rf = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        Peticiones servicio = rf.create(Peticiones.class);

        System.out.println("|====================|");
        System.out.println("|==LISTA DE ALUMNOS==|");
        System.out.println("|====================|");

        /*CREAMOS EL TRY CATCH CON EL QUE LANZAREMOS NUESTROS ALUMNOS*/
        try {
            Response<List<Alumno>> respuesta = servicio.listAlumnos().execute();
            if (respuesta.isSuccessful()) {
                List<Alumno> alumnos = respuesta.body();
                System.out.println(alumnos);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
