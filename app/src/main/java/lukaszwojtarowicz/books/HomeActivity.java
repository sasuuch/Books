package lukaszwojtarowicz.books;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.drm.DrmStore;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onReadBookClick(View view){
        Intent intent= new Intent(this,ReadBooksActivity.class);
        startActivity(intent);
    }


    public void onFindBooksClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://play.google.com/store/books"));
        startActivity(intent);
    }

    public void onFindLibraryClick(View view){
        Intent intent= new Intent(this,MapPane.class);
        startActivity(intent);
    }
    public void onAboutApplicationClick(View view){
        Intent intent= new Intent(this,AboutApplicationActivity.class);
        startActivity(intent);
    }

}
