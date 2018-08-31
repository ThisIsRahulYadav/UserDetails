package dumyprojects.com.userdetails.mainClasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dumyprojects.com.userdetails.Intereface.ApiInterface;
import dumyprojects.com.userdetails.R;
import dumyprojects.com.userdetails.helperClasses.GetterClass;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchDetails extends AppCompatActivity {
    String API_KEY;
   ProgressBar progressBar;
   GetterClass getterClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_details);
         m_RetrofitInstance();
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
    }

    private void m_RetrofitInstance(){
        Bundle bundle =getIntent().getExtras();
       String codeValue= bundle.getString("CODE VALUE");
        API_KEY= codeValue;


        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY ", Toast.LENGTH_LONG).show();
            return;
        }



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiInterface=retrofit.create(ApiInterface.class);

        Call<GetterClass> call = apiInterface.getUserDetails(API_KEY);


        call.enqueue(new Callback<GetterClass>() {
            @Override
            public void onResponse(Call<GetterClass> call, Response<GetterClass> response) {
                progressBar.setVisibility(View.GONE);
                //Log.e("TAG","Result in response ",));
               /* List<GetterClass> getterClasses= (List<GetterClass>) response.body();
                for(GetterClass get: getterClasses){
                    Log.e("name",get.getMu_Name());
                }*/

                // List<GetterClass> status1 = response.body().getStatus();


                String status = response.body().getStatus();
                try {

                    getterClass = response.body();
                    String my_status = getterClass.getStatus();
                    if (my_status.equalsIgnoreCase("true")) {
                       Log.e("output after success", String.valueOf(response.body()));
                        Toast.makeText(SearchDetails.this, "" + response.body(), Toast.LENGTH_SHORT).show();

                        //  ArrayList<String>
                    }


                } catch (Exception e) {

                }
//                JsonObject json = new JsonObject().get(response.body().toString()).getAsJsonObject();
//                Log.e("value of post", String.valueOf(json));
//                if (json.get(status).getAsString().contains("true")) {
//                    Toast.makeText(SearchDetails.this," CONTAINS",Toast.LENGTH_SHORT).show();
//                }
//
//                String userDetails = response.body().getMu_Name();
//                Log.e("TAG", "USER NAMES " + userDetails);
//
//                Toast.makeText(SearchDetails.this,"SUCCESS",Toast.LENGTH_SHORT).show();
//            }
            }
            @Override
            public void onFailure(Call<GetterClass> call, Throwable t) {
                Toast.makeText(SearchDetails.this,"FAILURE",Toast.LENGTH_SHORT).show();
            }
        });





     /*   Call<List<GetterClass>> call=apiInterface.getDetails();

        //call.enqueue(new Callback<List<GetterClass>>() {
            @Override
            public void onResponse(Call<List<GetterClass>> call, Response<List<GetterClass>> response) {

                List<GetterClass> getterClasses=response.body();
                for(GetterClass get: getterClasses){
                    Log.e("name",get.getMu_Name());
                }

            }

            @Override
            public void onFailure(Call<List<GetterClass>> call, Throwable t) {
                Toast.makeText(SearchDetails.this,t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });*/
    }

   /* private void m_Spinner(){
        String[] countryNames = {"Select Country", "India", "China", "Australia",   "Portugle", "America", "New Zealand"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner_search);

        hintAdapter = new CustomArrayAdapter(getApplicationContext(), R.layout.simple_row,countriesList,getApplicationContext());
        spinner.setAdapter(hintAdapter);
    }*/
}
