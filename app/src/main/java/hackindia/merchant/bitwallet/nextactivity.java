package hackindia.merchant.bitwallet;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;


/**
 * Created by Srinidhi on 2015-07-19.
 */
public class nextactivity extends Activity{

    double totalsum=0;
    String response;
        int gotresponse=0;
    Handler h;
    Runnable r1;
    TextView tv1;
    Button mybtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linklayout);
        tv1=(TextView) findViewById(R.id.tv1);
        mybtn1=(Button) findViewById(R.id.mybtn1);
        mybtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,"Hi! We are from bitcoin.\nThis is the link that you have to visit, to complete the transaction\n\n"+response);
                startActivity(i);
            }
        });
        totalsum=getIntent().getDoubleExtra("totalamount",-1);
        if(totalsum==-1)
            Toast.makeText(getApplicationContext(),"Did not receive any amount",Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(getApplicationContext(),String.valueOf(totalsum),Toast.LENGTH_SHORT).show();
            final ProgressDialog progressDialog=new ProgressDialog(this);
            progressDialog.setTitle("Please wait");
            progressDialog.setMessage("Waiting for server response");
            progressDialog.show();

            Thread t=new Thread(new Runnable() {
                @Override
                public void run() {
                    gotresponse=0;
                    String url="http://192.168.43.14:12347/sendlink"; //fill this url later and then append the totalamount parameter

                    response="some shit"; //may be consider changing it
                    HttpClient httpClient=new DefaultHttpClient();
                    ResponseHandler responseHandler=new BasicResponseHandler();
                    HttpGet httpGet=new HttpGet(url);
                    try {
                        //response=httpClient.execute(httpGet).toString();
                        response=httpClient.execute(httpGet,responseHandler).toString();
                        gotresponse=1;
                    } catch (IOException e) {
                        gotresponse=0;
                        e.printStackTrace();
                    }
                }
            });

            t.start();

            h=new Handler();
            r1=new Runnable() {
                @Override
                public void run() {
                    if(gotresponse==1){
                        progressDialog.cancel();
                        progressDialog.dismiss();
                        Toast.makeText(getApplicationContext(),response,Toast.LENGTH_SHORT).show();
                        tv1.setText("The total amount is "+totalsum+"\n\n6 Please share the below link with the consumer\n\n");
                        tv1.append(response);
                    }

                    else h.postDelayed(this,200);
                }
            };
            h.postDelayed(r1,500);



        }





    }
}
