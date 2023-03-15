package silva.pereira.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Selecionando o botão pelo seu Id
        Button btnEnviar = findViewById(R.id.btnEnviar);
        // Adicionando o evento de click
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            // Evento de click
            public void onClick(View view) {
                // Selecionando o EditText pelo seu Id
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                // Pegando texto detro da caixa de texto
                String Texto = etDigiteAqui.getText().toString();
                // Criando variavel Intent que fala em qual página você será direcionado
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                // Adiciona o texto inserido pelo usuário
                intent.putExtra("Texto", Texto);
                // Iniando a intent
                startActivity(intent);
            }
        });
    }
}