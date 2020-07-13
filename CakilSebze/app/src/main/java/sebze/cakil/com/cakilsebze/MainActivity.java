package sebze.cakil.com.cakilsebze;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity  extends AppCompatActivity  {





Main2Activity xd=new Main2Activity();

    float    aa;
    float    bb;
    float  cc;
    float  dd;
    float ee;
    float  ff;
    float   gg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aa=xd.hı;
        bb=xd.ıj;
        cc=xd.jk;
        dd=xd.kl;
        ee=xd.lm;
        ff=xd.mn;
        gg=xd.no;


        final EditText a=(EditText) findViewById(R.id.editText);
        final  EditText b=(EditText) findViewById(R.id.editText2);
        final  EditText c=(EditText) findViewById(R.id.editText3);
        final EditText d=(EditText) findViewById(R.id.editText4);
        final EditText e=(EditText) findViewById(R.id.editText5);
        final  EditText f=(EditText) findViewById(R.id.editText6);
        final  EditText g=(EditText) findViewById(R.id.editText7);
        final  EditText cd=(EditText) findViewById(R.id.editText8);

        Button btn=(Button) findViewById(R.id.button);
        Button btn2=(Button) findViewById(R.id.button2);
        Button btn3=(Button) findViewById(R.id.button3);




        btn.setOnClickListener(new View.OnClickListener(){







            @Override
                                   public void onClick(View v) {
                float    h;
                float    ı;
                float  j;
                float  k;
                float l;
                float  m;
                float   n;

                float verilen;
             if (!TextUtils.isEmpty(a.getText())){
                    h=Float.parseFloat(a.getText().toString());
             }
else {
                 h=0;
             }
                if (!TextUtils.isEmpty(b.getText())){
                    ı=Float.parseFloat(b.getText().toString());
                }
                else {
                    ı=0;
                }      if (!TextUtils.isEmpty(c.getText())){
                    j=Float.parseFloat(c.getText().toString());
                }
                else {
                    j=0;
                }      if (!TextUtils.isEmpty(d.getText())){
                    k=Float.parseFloat(d.getText().toString());
                }
                else {
                    k=0;
                }      if (!TextUtils.isEmpty(e.getText())){
                    l=Float.parseFloat(e.getText().toString());
                }
                else {
                    l=0;
                }      if (!TextUtils.isEmpty(f.getText())){
                    m=Float.parseFloat(f.getText().toString());
                }
                else {
                    m=0;
                }      if (!TextUtils.isEmpty(g.getText())){
                    n=Float.parseFloat(g.getText().toString());
                }
                else {
                    n=0;
                }
                if (!TextUtils.isEmpty(cd.getText())){
                    verilen=Float.parseFloat(cd.getText().toString());
                }
                else {
                    verilen=0;
                }


               float top=(aa*h)+(bb*ı)+(cc*j)+(dd*k)+(ee*l)+(ff*m)+(gg*n);
                float paraustu;
if (verilen>0){
    paraustu=verilen-top;
}
else{
    paraustu=0;
}
                                       Toast.makeText(getApplication(),"TOPLAM: "+top+" TL"+"  PARAÜSTÜ: "+paraustu+" TL",Toast.LENGTH_LONG).show();
                                   }
                               }
        );
btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                Intent ıntnd2=new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(ıntnd2);

                            }
                        }


);


        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent ıntnd=new Intent(getApplicationContext(),Main2Activity.class);
                                        startActivity(ıntnd);

                                    }
                                }


        );

    }

}
