package ListadoDeHogaresDeTransito;

import ListadoDeHogaresDeTransito.Entidades.ListadoDeHogares;
import retrofit2.Call;
import retrofit2.http.GET;

public interface HogaresDeTransito {
    @GET("hogares")
    Call<ListadoDeHogares> hogares();

}
