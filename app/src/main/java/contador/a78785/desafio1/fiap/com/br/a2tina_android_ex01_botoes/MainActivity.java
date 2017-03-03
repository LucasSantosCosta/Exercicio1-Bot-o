package contador.a78785.desafio1.fiap.com.br.a2tina_android_ex01_botoes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txvw;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvw = (TextView) findViewById(R.id.numero);
    }

    public void incrementar (View v) {

        if (cont < 10) {
            cont++;
        } else {
            //Quero traduzir essa frase
            Toast.makeText(this, "Contador só pode decrementar até 10", Toast.LENGTH_SHORT).show();
        }
        txvw.setText("" + cont);
    }

    public void decrementar(View v) {

        if(cont > 0){
            cont = cont - 1;
        }else{
            Toast.makeText(this, "Contador só pode decrementar até 0", Toast.LENGTH_SHORT).show();
        }
        txvw.setText("" + cont);

    }
}
