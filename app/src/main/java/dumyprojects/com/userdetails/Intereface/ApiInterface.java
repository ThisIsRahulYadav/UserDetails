package dumyprojects.com.userdetails.Intereface;

import java.util.List;

import dumyprojects.com.userdetails.helperClasses.GetterClass;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by lenovo on 8/30/2018.
 */

public interface ApiInterface {

    String BASE_URL = "http://sss.ashishsrivastava.info/WebApi/Common/";
    /* String BASE_URL="http://sss.ashishsrivastava.info/WebApi/Common/Financial?Strtype=13&StateName=1";

    @GET("1")
    Call<List<GetterClass>> getDetails();
*/

  //   (http://api.themoviedb.org/3/movie/top_rated?api_key=INSERT_YOUR_API_KEY)



    @GET("Financial?Strtype=13")
    Call<GetterClass>getUserDetails (@Query("StateName") String apiKey);

   /* @GET("movie/{id}")
    Call<GetterClass> getUserDetails(@Path("id") int id, @Query("api_key") String apiKey);
*/
}
