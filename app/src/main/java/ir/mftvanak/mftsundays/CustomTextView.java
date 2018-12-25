package ir.mftvanak.mftsundays;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        String fontName = "vazir.ttf";
        Typeface vazir = Typeface.createFromAsset(context.getAssets(), fontName);
        this.setTypeface(vazir);
    }
}
