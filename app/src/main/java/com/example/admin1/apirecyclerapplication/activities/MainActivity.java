package com.example.admin1.apirecyclerapplication.activities;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.widget.Toast;

        import com.android.volley.NetworkResponse;
        import com.android.volley.Request;
        import com.android.volley.toolbox.JsonObjectRequest;
        import com.example.admin1.apirecyclerapplication.R;
        import com.example.admin1.apirecyclerapplication.adapters.MyAdapter;
        import com.example.admin1.apirecyclerapplication.interfaces.ApiServiceCaller;
        import com.example.admin1.apirecyclerapplication.models.FirstModel;
        import com.example.admin1.apirecyclerapplication.utilities.App;
        import com.example.admin1.apirecyclerapplication.webservices.APiConstants;
        import com.example.admin1.apirecyclerapplication.webservices.JsonResponse;
        import com.example.admin1.apirecyclerapplication.webservices.WebRequest;

        import org.json.JSONObject;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ApiServiceCaller{

    private RecyclerView recyclerView;
    private ArrayList<FirstModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_view);
        arrayList = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        getData();

    }

    private void getData() {

        JsonObjectRequest request = WebRequest.callPostMethod(this, "", null, Request.Method.POST, APiConstants.URL,
                APiConstants.URL, this, "");
        App.getInstance().addToRequestQueue(request, APiConstants.URL);
    }

    @Override
    public void onAsyncSuccess(JsonResponse jsonResponse, String label) {

        if (jsonResponse != null) {
            if (jsonResponse.result != null) {
                arrayList.addAll(jsonResponse.contacts);
                MyAdapter myAdapter = new MyAdapter(arrayList, this);
                recyclerView.setAdapter(myAdapter);
                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    public void onAsyncFail(String message, String label, NetworkResponse response) {
        Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAsyncCompletelyFail(String message, String label) {
        Toast.makeText(this, "Completely Fail", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Completely Fail", Toast.LENGTH_SHORT).show();
    }
}
