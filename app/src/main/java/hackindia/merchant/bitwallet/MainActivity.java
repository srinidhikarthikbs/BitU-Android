package hackindia.merchant.bitwallet;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    Button placeorder;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15;
    ArrayList<ImageView> iv;
    TextView name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,name15;
    ArrayList<TextView> name;
    TextView content1,content2,content3,content4,content5,content6,content7,content8,content9,content10,content11,content12,content13,content14,content15;
    ArrayList<TextView> content;
    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14,et15;
    ArrayList<EditText> et;
    ImageView plus1,plus2,plus3,plus4,plus5,plus6,plus7,plus8,plus9,plus10,plus11,plus12,plus13,plus14,plus15;
    ArrayList<ImageView> plus;
    double totalsum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainnew);
        //ImageView[] iv={iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15};
        //TextView[] name={name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,name15};
        //TextView[] content={content1,content2,content3,content4,content5,content6,content7,content8,content9,content10,content11,content12,content13,content14,content15};
        //final EditText[] et={et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14,et15};

        ActionBar actionBar=getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        iv=new ArrayList<ImageView>(15);
        plus=new ArrayList<ImageView>(15);
        name=new ArrayList<TextView>(15);
        content=new ArrayList<TextView>(15);
        et=new ArrayList<EditText>(15);

        init();

        for(int i=0;i<15;i++)
        {
            name.get(i).setText("Item "+(i+1));
            content.get(i).setText("Content "+(i+1));
            et.get(i).setText("0");
        }
        content.get(0).setText("Content 1");
        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<15;i++)
                    totalsum+=(Integer.valueOf(String.valueOf(et.get(i).getText()))*staticvalues.prices[i]);
                if(totalsum!=0){
                    Intent i=new Intent(MainActivity.this,nextactivity.class);
                    i.putExtra("totalamount",totalsum);
                    startActivity(i);
                }
                else Toast.makeText(getApplicationContext(),"No items selected",Toast.LENGTH_SHORT).show();


            }
        });
    }

    public void init()
    {
        iv1=(ImageView) findViewById(R.id.iv1);iv.add(iv1);
        iv2=(ImageView) findViewById(R.id.iv2);iv.add(iv2);
        iv3=(ImageView) findViewById(R.id.iv3);iv.add(iv3);
        iv4=(ImageView) findViewById(R.id.iv4);iv.add(iv4);
        iv5=(ImageView) findViewById(R.id.iv5);iv.add(iv5);
        iv6=(ImageView) findViewById(R.id.iv6);iv.add(iv6);
        iv7=(ImageView) findViewById(R.id.iv7);iv.add(iv7);
        iv8=(ImageView) findViewById(R.id.iv8);iv.add(iv8);
        iv9=(ImageView) findViewById(R.id.iv9);iv.add(iv9);
        iv10=(ImageView) findViewById(R.id.iv10);iv.add(iv10);
        iv11=(ImageView) findViewById(R.id.iv11);iv.add(iv11);
        iv12=(ImageView) findViewById(R.id.iv12);iv.add(iv12);
        iv13=(ImageView) findViewById(R.id.iv13);iv.add(iv13);
        iv14=(ImageView) findViewById(R.id.iv14);iv.add(iv14);
        iv15=(ImageView) findViewById(R.id.iv15);iv.add(iv15);

        name1=(TextView) findViewById(R.id.name1);name.add(name1);
        name2=(TextView) findViewById(R.id.name2);name.add(name2);
        name3=(TextView) findViewById(R.id.name3);name.add(name3);
        name4=(TextView) findViewById(R.id.name4);name.add(name4);
        name5=(TextView) findViewById(R.id.name5);name.add(name5);
        name6=(TextView) findViewById(R.id.name6);name.add(name6);
        name7=(TextView) findViewById(R.id.name7);name.add(name7);
        name8=(TextView) findViewById(R.id.name8);name.add(name8);
        name9=(TextView) findViewById(R.id.name9);name.add(name9);
        name10=(TextView) findViewById(R.id.name10);name.add(name10);
        name11=(TextView) findViewById(R.id.name11);name.add(name11);
        name12=(TextView) findViewById(R.id.name12);name.add(name12);
        name13=(TextView) findViewById(R.id.name13);name.add(name13);
        name14=(TextView) findViewById(R.id.name14);name.add(name14);
        name15=(TextView) findViewById(R.id.name15);name.add(name15);

        content1=(TextView) findViewById(R.id.content1);content.add(content1);
        content2=(TextView) findViewById(R.id.content2);content.add(content2);
        content3=(TextView) findViewById(R.id.content3);content.add(content3);
        content4=(TextView) findViewById(R.id.content4);content.add(content4);
        content5=(TextView) findViewById(R.id.content5);content.add(content5);
        content6=(TextView) findViewById(R.id.content6);content.add(content6);
        content7=(TextView) findViewById(R.id.content7);content.add(content7);
        content8=(TextView) findViewById(R.id.content8);content.add(content8);
        content9=(TextView) findViewById(R.id.content9);content.add(content9);
        content10=(TextView) findViewById(R.id.content10);content.add(content10);
        content11=(TextView) findViewById(R.id.content11);content.add(content11);
        content12=(TextView) findViewById(R.id.content12);content.add(content12);
        content13=(TextView) findViewById(R.id.content13);content.add(content13);
        content14=(TextView) findViewById(R.id.content14);content.add(content14);
        content15=(TextView) findViewById(R.id.content15);content.add(content15);

        et1=(EditText) findViewById(R.id.et1);et.add(et1);
        et2=(EditText) findViewById(R.id.et2);et.add(et2);
        et3=(EditText) findViewById(R.id.et3);et.add(et3);
        et4=(EditText) findViewById(R.id.et4);et.add(et4);
        et5=(EditText) findViewById(R.id.et5);et.add(et5);
        et6=(EditText) findViewById(R.id.et6);et.add(et6);
        et7=(EditText) findViewById(R.id.et7);et.add(et7);
        et8=(EditText) findViewById(R.id.et8);et.add(et8);
        et9=(EditText) findViewById(R.id.et9);et.add(et9);
        et10=(EditText) findViewById(R.id.et10);et.add(et10);
        et11=(EditText) findViewById(R.id.et11);et.add(et11);
        et12=(EditText) findViewById(R.id.et12);et.add(et12);
        et13=(EditText) findViewById(R.id.et13);et.add(et13);
        et14=(EditText) findViewById(R.id.et14);et.add(et14);
        et15=(EditText) findViewById(R.id.et15);et.add(et15);

        plus1=(ImageView) findViewById(R.id.plus1);plus.add(plus1);
        plus2=(ImageView) findViewById(R.id.plus2);plus.add(plus2);
        plus3=(ImageView) findViewById(R.id.plus3);plus.add(plus3);
        plus4=(ImageView) findViewById(R.id.plus4);plus.add(plus4);
        plus5=(ImageView) findViewById(R.id.plus5);plus.add(plus5);
        plus6=(ImageView) findViewById(R.id.plus6);plus.add(plus6);
        plus7=(ImageView) findViewById(R.id.plus7);plus.add(plus7);
        plus8=(ImageView) findViewById(R.id.plus8);plus.add(plus8);
        plus9=(ImageView) findViewById(R.id.plus9);plus.add(plus9);
        plus10=(ImageView) findViewById(R.id.plus10);plus.add(plus10);
        plus11=(ImageView) findViewById(R.id.plus11);plus.add(plus11);
        plus12=(ImageView) findViewById(R.id.plus12);plus.add(plus12);
        plus13=(ImageView) findViewById(R.id.plus13);plus.add(plus13);
        plus14=(ImageView) findViewById(R.id.plus14);plus.add(plus14);
        plus15=(ImageView) findViewById(R.id.plus15);plus.add(plus15);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(String.valueOf(Integer.valueOf(et1.getText().toString())+1));
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(String.valueOf(Integer.valueOf(et2.getText().toString())+1));
            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et3.setText(String.valueOf(Integer.valueOf(et3.getText().toString())+1));
            }
        });
        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et4.setText(String.valueOf(Integer.valueOf(et4.getText().toString())+1));
            }
        });
        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et5.setText(String.valueOf(Integer.valueOf(et5.getText().toString())+1));
            }
        });
        plus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et6.setText(String.valueOf(Integer.valueOf(et6.getText().toString())+1));
            }
        });
        plus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et7.setText(String.valueOf(Integer.valueOf(et7.getText().toString())+1));
            }
        });
        plus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et8.setText(String.valueOf(Integer.valueOf(et8.getText().toString())+1));
            }
        });
        plus9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et9.setText(String.valueOf(Integer.valueOf(et9.getText().toString())+1));
            }
        });
        plus10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et10.setText(String.valueOf(Integer.valueOf(et10.getText().toString())+1));
            }
        });
        plus11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et11.setText(String.valueOf(Integer.valueOf(et11.getText().toString())+1));
            }
        });
        plus12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et12.setText(String.valueOf(Integer.valueOf(et12.getText().toString())+1));
            }
        });
        plus13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et13.setText(String.valueOf(Integer.valueOf(et13.getText().toString())+1));
            }
        });
        plus14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et14.setText(String.valueOf(Integer.valueOf(et14.getText().toString())+1));
            }
        });
        plus15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et15.setText(String.valueOf(Integer.valueOf(et15.getText().toString())+1));
            }
        });



        placeorder=(Button) findViewById(R.id.btn1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
