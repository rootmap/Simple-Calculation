package com.selfcode.space.simplecalculation;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        
        Button calc=(Button)findViewById(R.id.btnCalc);
        
        calc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				EditText number=(EditText)findViewById(R.id.txtNum);
				EditText number_two=(EditText)findViewById(R.id.txtndNum);
		        TextView result=(TextView)findViewById(R.id.lblResult);
		        TextView msgOne=(TextView)findViewById(R.id.lblErrorMsgst);
		        TextView msgTwo=(TextView)findViewById(R.id.lblmsgNd);
		        
		        if(number.length()<1)
		        {
		        	msgTwo.setText("");
		        	result.setText("0.00");
		        	msgOne.setText("Field should not be empty.");
		        	msgOne.setTextColor(Color.parseColor("#FF0000"));
		        }
		        else if(number_two.length()<1)
		        {
		        	msgOne.setText("");
		        	result.setText("0.00");
		        	msgTwo.setText("Field should not be empty.");
		        	msgTwo.setTextColor(Color.parseColor("#FF0000"));
		        }
		        else
		        {
		        	msgOne.setText("");
		        	msgTwo.setText("");
			        double num=Double.parseDouble(number.getText().toString());
			        double num_two=Double.parseDouble(number_two.getText().toString());
			        //double calculate=num*num_two;
			        //String calculate=SimpleCalc.multiNum(num, num_two);
			        SimpleCalc c=new SimpleCalc(num, num_two);
			        String res=c.multiNumC();
			        	   result.setText(res);
		        }
			}
		});
        
        
        
        
    }

    
    
    
    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
