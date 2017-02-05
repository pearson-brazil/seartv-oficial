package br.com.pearson.seartv.ui;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import br.com.pearson.seartv.model.Image;

/**
 * Created by Willian on 05/02/2017.
 */

public class ImageGalleryAdapter extends ArrayAdapter {
    public ImageGalleryAdapter(Context context, int layoutResourceId, ArrayList<Image> urlImages) {
        super(context, layoutResourceId, urlImages);

    }
}
