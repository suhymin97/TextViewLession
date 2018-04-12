package linhmil.oop.hcmiu.textviewlession;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1= (TextView) findViewById(R.id.tv1);
        tv2= (TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        tv4= (TextView) findViewById(R.id.tv4);
        String strHTML = "This <i> is </i> a <b> text </b> of <u> html </u>";
        Typeface thufap= Typeface.createFromAsset(this.getAssets(),"vnthfap3.TTF");

        tv1.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD);
        tv1.setTextColor(Color.BLUE);
        tv1.setTextSize(30);

        tv2.setTypeface(Typeface.SERIF,Typeface.ITALIC);
        tv2.setTextSize(80);

        tv3.setTypeface(thufap, Typeface.BOLD_ITALIC);
        tv4.setTypeface(Typeface.MONOSPACE);
        tv4.setText(Html.fromHtml(strHTML));
        SpannableString spanStr = new SpannableString(strHTML);
        spanStr.setSpan( new StrikethroughSpan(), 6,10,0);
        tv4.setText(spanStr);
        tv3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.mipmap.ic_launcher,0);
        tv4.setShadowLayer(30,10,10,Color.BLACK);

        Shader shader = new LinearGradient(0,0,0,tv2.getTextSize(),Color.YELLOW,Color.RED, Shader.TileMode.CLAMP);
        tv3.getPaint().setShader(shader);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.cheetah);
        Shader shaderCheetah = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        tv2.getPaint().setShader(shaderCheetah);
    }
}
