package br.com.pearson.seartv.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import br.com.pearson.seartv.R;
import br.com.pearson.seartv.model.Image;

/**
 * Created by Willian on 05/02/2017.
 */

public class ImageGalleryAdapter extends ArrayAdapter {
    private Context context;
    private int layoutResourceId;
    private ArrayList<Image> images = new ArrayList();

    public ImageGalleryAdapter(Context context, int layoutResourceId, ArrayList<Image> urlImages) {
        super(context, layoutResourceId, urlImages);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.images = urlImages;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        final ViewHolder holder;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.item_image_gallery, parent, false);
            holder = new ViewHolder();
            holder.image = (ImageView) row.findViewById(R.id.image);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        holder.image.setBackground(context.getDrawable(R.drawable.whiplash));

        return row;
    }

    static class ViewHolder {
        ImageView image;
    }
}
