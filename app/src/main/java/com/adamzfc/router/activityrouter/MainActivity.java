package com.adamzfc.router.activityrouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.adamzfc.router.ActivityRouter;
import com.adamzfc.router.annotation.Router;
import com.adamzfc.router.api.ExtraData;

@Router("test")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityRouter.go(MainActivity.this, "second", new ExtraData("tttt", "ttttt").build(),
                        v);
            }
        });
    }
}
