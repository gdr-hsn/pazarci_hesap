package sebze.cakil.com.cakilsebze;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    SharedPreferences sp;

 public static float   hı;
  public static  float   ıj;
  public   static  float  jk;
public   static  float  kl;
public static float lm;
  public   static  float  mn;
   public static float   no;

    protected void onPause() {



        SharedPreferences.Editor ed= sp.edit();
        ed.putFloat("domates", hı);
        ed.putFloat("salatalık",  ıj);
        ed.putFloat("dolma biber",  jk);
        ed.putFloat("acı biber",  kl);
        ed.putFloat("patlıcan",  lm);
        ed.putFloat("fasulye", mn);
        ed.putFloat("kabak",  no);
        ed.commit();

        super.onPause();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





        sp= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        SharedPreferences.Editor ed= sp.edit();



        final  EditText ab=(EditText) findViewById(R.id.editText15);
        final  EditText bc=(EditText) findViewById(R.id.editText16);
        final  EditText cd=(EditText) findViewById(R.id.editText17);
        final EditText de=(EditText) findViewById(R.id.editText18);
        final EditText ef=(EditText) findViewById(R.id.editText19);
        final  EditText fg=(EditText) findViewById(R.id.editText20);
        final  EditText gh=(EditText) findViewById(R.id.editText21);


        hı=sp.getFloat("domates", 0);
        ıj=sp.getFloat("salatalık", 0);
        jk=sp.getFloat("dolma biber", 0);
        kl=sp.getFloat("acı biber", 0);
        lm=sp.getFloat("patlıcan", 0);
        mn=sp.getFloat("fasulye", 0);
        no=sp.getFloat("kabak", 0);


        ab.setText(""+hı);
        bc.setText(""+ıj);
        cd.setText(""+jk);
        de.setText(""+kl);
        ef.setText(""+lm);
        fg.setText(""+mn);
        gh.setText(""+no);



        Button btn4=(Button)(findViewById(R.id.button4));
        Button btn5=(Button)(findViewById(R.id.button5));
        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent ıntnd4=new Intent(getApplicationContext(),MainActivity.class);


                                        startActivity(ıntnd4);

                                    }
                                }


        );

        btn5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {


hı=Float.parseFloat(ab.getText().toString());
                                        ıj=Float.parseFloat(bc.getText().toString());
                                        jk=Float.parseFloat(cd.getText().toString());
                                        kl=Float.parseFloat(de.getText().toString());
                                        lm=Float.parseFloat(ef.getText().toString());
                                        mn=Float.parseFloat(fg.getText().toString());
                                        no=Float.parseFloat(gh.getText().toString());

                                        Toast.makeText(getApplication(),"KAYDEDİLDİ ",Toast.LENGTH_SHORT).show();


                                    }
                                }


        );





    }


}
