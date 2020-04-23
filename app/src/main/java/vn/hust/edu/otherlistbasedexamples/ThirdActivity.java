package vn.hust.edu.otherlistbasedexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    List<EmailItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    items = new ArrayList<>();
    for (int i=0; i<10; i++)
      items.add(new EmailItemModel(name:"Hello World", subject: "Subject subject", content: "Content content", time: "12:00 PM" ));

    }
}
