package ohm.softa.a08.services;

import com.google.gson.Gson;
import ohm.softa.a08.api.OpenMensaAPI;
import ohm.softa.a08.model.Meal;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class OpenMensaAPIService {
	private static OpenMensaAPIService instance;

	private OpenMensaAPI api;

	private OpenMensaAPIService() {
	}

	public static OpenMensaAPIService getInstance() {
		if (instance == null) {
			instance = new OpenMensaAPIService();
		}
		return instance;
	}

	public OpenMensaAPI getApi() {
		if (api == null) {
			var gson = new Gson();
			/* initialize Retrofit instance */
			var retrofit = new Retrofit.Builder()
				.addConverterFactory(GsonConverterFactory.create(gson))
				.baseUrl("http://openmensa.org/api/v2/")
				.build();

			/* create OpenMensaAPI instance */
			api = retrofit.create(OpenMensaAPI.class);
		}
		return api;
	}
}
