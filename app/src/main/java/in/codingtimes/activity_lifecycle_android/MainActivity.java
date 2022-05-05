package in.codingtimes.activity_lifecycle_android;


import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Activity Lifecycle","onCreate invoked");
        Toast.makeText(getApplicationContext(),"Activity Lifecycle, onCreate invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Lifecycle","onStart invoked");
        Toast.makeText(getApplicationContext(),"Activity Lifecycle ,onStart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecycle","onResume invoked");
        Toast.makeText(getApplicationContext(),"Activity Lifecycle ,onResume invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle","onPause invoked");
        Toast.makeText(getApplicationContext(),"Activity Lifecycle ,onPause invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle","onStop invoked");
        Toast.makeText(getApplicationContext(),"Activity Lifecycle ,onStop invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Lifecycle","onRestart invoked");
        Toast.makeText(getApplicationContext(),"Activity Lifecycle ,onRestart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecycle","onDestroy invoked");
        Toast.makeText(getApplicationContext(),"Activity Lifecycle ,onDestroy invoked",Toast.LENGTH_SHORT).show();
    }
}
