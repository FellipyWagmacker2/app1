package silva.pereira.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent();
        String Texto = intent.getStringExtra("Texto");
        TextView tvExibir = findViewById(R.id.tvExibir);
        tvExibir.setText(Texto);
    }
}