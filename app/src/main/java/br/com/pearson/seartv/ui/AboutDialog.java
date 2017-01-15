package br.com.pearson.seartv.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.TextView;

import br.com.seartv.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Willian on 15/01/2017.
 */
public class AboutDialog extends Dialog {

    @Bind(R.id.btn_positive)
    TextView btnPositive;

    Context context;

    public AboutDialog(Context context) {
        super(context);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.dialog_about);
        ButterKnife.bind(this);

        this.context = context;
    }

    @OnClick(R.id.btn_positive)
    public void onPositiveButtonClick() {
        dismiss();
    }

    public void showDialog() {
        if (!((Activity) context).isFinishing()) {
            show();
        }
    }
}
