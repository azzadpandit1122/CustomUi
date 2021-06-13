package com.example.customui.DataModel;

import android.widget.ImageView;
import android.widget.TextView;

public class DataModel {
    ImageView starticon;
    ImageView endicon;
    TextView title;

    public DataModel(ImageView starticon, ImageView endicon, TextView title) {
        this.starticon = starticon;
        this.endicon = endicon;
        this.title = title;
    }

    public ImageView getStarticon() {
        return starticon;
    }

    public void setStarticon(ImageView starticon) {
        this.starticon = starticon;
    }

    public ImageView getEndicon() {
        return endicon;
    }

    public void setEndicon(ImageView endicon) {
        this.endicon = endicon;
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }
}
