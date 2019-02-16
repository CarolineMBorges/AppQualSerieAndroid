package qualserie.cursoandroid.com.qualserie;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView imagemExibicao;

    /*
    * Quando sobreescrevemos o método onCreate, a primeira coisa que fazemos é chamar o próprio método da classe mãe
    * super.onCreate(savedInstanceState), para que a base de seja criada
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        * setContentView(R.layout.activity_main), é responsável por configurar o layout XML na nossa Activity
        * e definir todos os elementos de interface do usuário, tais como o EditText e Buttons.
        * */
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarId);
        imagemExibicao = findViewById(R.id.imageViewId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                int valorProgresso = progress;

                if(valorProgresso == 1){
                    imagemExibicao.setImageResource(R.drawable.pouco);
                } else if(progress == 2) {
                    imagemExibicao.setImageResource(R.drawable.medio);
                } else if(progress == 3){
                    imagemExibicao.setImageResource(R.drawable.muito);
                } else if (progress == 4){
                    imagemExibicao.setImageResource(R.drawable.susto);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
