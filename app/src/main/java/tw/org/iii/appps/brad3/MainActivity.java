package tw.org.iii.appps.brad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView txtLottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLottery = findViewById(R.id.textLottery);
    }

    public void createLottery(View view){
        String lottery = lottery();
        txtLottery.setText(lottery);
    }

    private String lottery(){
        TreeSet<Integer> lottery = new TreeSet<>();
        while (lottery.size() < 6){
            lottery.add((int)(Math.random()*38+1));
        }
        return lottery.toString() + " : " + (int)(Math.random()*8+1);
    }

}
