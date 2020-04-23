package vn.hust.edu.otherlistbasedexamples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class EmailItemModel{
    String name;
    String subject;
    String content;
    String time;
    boolean isFavorite;
    int color;

    public EmailItemModel(String name, String subject, String content, String time) {
        this.name = name;
        this.subject = subject;
        this.content = content;
        this.time = time;

        isFavorite = false;
        Random random = new Random();
        color = random.nextInt();
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public int getColor() {
        return color;
    }
}