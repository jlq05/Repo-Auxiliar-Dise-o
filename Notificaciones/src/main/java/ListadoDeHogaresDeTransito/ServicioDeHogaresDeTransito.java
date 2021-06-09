package ListadoDeHogaresDeTransito;

import ListadoDeHogaresDeTransito.Entidades.ListadoDeHogares;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ServicioDeHogaresDeTransito {
    private static ServicioDeHogaresDeTransito  instancia = null;
    private static final String urlAPI = "https://api.refugiosdds.com.ar/api/";
    private Retrofit retrofit;

    private ServicioDeHogaresDeTransito(){
        this.retrofit = new Retrofit.Builder().baseUrl(urlAPI).addConverterFactory(GsonConverterFactory.create()).build()
        ;
    }
    public static ServicioDeHogaresDeTransito getInstancia(){
        if(instancia == null){
            instancia = new ServicioDeHogaresDeTransito();
        }
        return instancia;
    }
    public ListadoDeHogares listadoDeHogares() throws IOException {
        HogaresDeTransito hogaresDeTransito = this.retrofit.create(HogaresDeTransito.class);
        Call<ListadoDeHogares> requestlistadoDeHogaresCall = hogaresDeTransito.hogares();
        Response<ListadoDeHogares> responseListadoDeHogares = requestlistadoDeHogaresCall.execute();
        return responseListadoDeHogares.body();
    }
}
