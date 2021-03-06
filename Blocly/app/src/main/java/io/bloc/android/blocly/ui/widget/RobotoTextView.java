package io.bloc.android.blocly.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

import io.bloc.android.blocly.R;

/**
 * Created by Kevin on 8/4/2015.
 */
public class RobotoTextView extends TextView {

    // #3
    private static Map<String, Typeface> sTypefaces = new HashMap<String, Typeface>();

    public RobotoTextView(Context context) {
        super(context);
    }

    // #4
    public RobotoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        attrs.getAttributeValue("MyAwesomeApp", "Roboto");
        extractFont(attrs);
    }

    public RobotoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        extractFont(attrs);
    }

    void extractFont(AttributeSet attrs) {
        // #5
        if (isInEditMode()) {
            return;
        }
        if (attrs == null) {
            return;
        }
        // #6
        TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(
                attrs, R.styleable.Roboto, 0, 0);
        // #7
        int robotoFontIndex = typedArray.getInteger(R.styleable.Roboto_robotoFont, -1);
        // #8
        typedArray.recycle();
        // #9
        String[] stringArray = getResources().getStringArray(R.array.roboto_font_file_names);
        if (robotoFontIndex < 0 || robotoFontIndex >= stringArray.length) {
            return;
        }
        String robotoFont = stringArray[robotoFontIndex];
        Typeface robotoTypeface = null;
        // #10
        if (sTypefaces.containsKey(robotoFont)) {
            robotoTypeface = sTypefaces.get(robotoFont);
        } else {
            // #11
            robotoTypeface = Typeface.createFromAsset(getResources().getAssets(), "fonts/RobotoTTF/" + robotoFont);
            sTypefaces.put(robotoFont, robotoTypeface);
        }
        // #12
        setTypeface(robotoTypeface);
    }
}