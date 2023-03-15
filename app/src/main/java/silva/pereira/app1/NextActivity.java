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
        // Criando Intent que iniciou essa atividade
        Intent intent = getIntent();
        // Seleciona o texto enviado na página anterior como um extra
        String Texto = intent.getStringExtra("Texto");
        // Seleciona o TextView pela seu Id
        TextView tvExibir = findViewById(R.id.tvExibir);
        // Armazena o texto recebido
        tvExibir.setText(Texto);
    }
}