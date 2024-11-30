package com.example.ifome;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONObject;

public class tela_pedidos extends AppCompatActivity {

    CheckBox check_pizza, check_bebida;
    RadioGroup radio_pizza, radio_entrega;
    Spinner sp_pizza, sp_marcas;
    EditText edit_endereco;
    Button btEnviarPedido, btRetornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pedidos);

        check_pizza = findViewById(R.id.cpizza);
        radio_pizza = findViewById(R.id.rgtamanho);
        sp_pizza = findViewById(R.id.spsabores);
        check_bebida = findViewById(R.id.crefri);
        sp_marcas = findViewById(R.id.spmarcas);
        radio_entrega = findViewById(R.id.rgtele);
        edit_endereco = findViewById(R.id.edtend);
        btEnviarPedido = findViewById(R.id.button);
        btRetornar = findViewById(R.id.button2);

        btEnviarPedido.setOnClickListener(view -> new EnviaJsonPost().execute());

        btRetornar.setOnClickListener(view -> finish());
    }

    private boolean isPizzaChecked() {
        return check_pizza.isChecked();
    }

    private boolean isBebidaChecked() {
        return check_bebida.isChecked();
    }

    private String getSelectedPizzaSize() {
        int selectedId = radio_pizza.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton selectedButton = findViewById(selectedId);
            return selectedButton.getText().toString();
        }
        return "NA";
    }

    private String getSelectedDeliveryOption() {
        int selectedId = radio_entrega.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton selectedButton = findViewById(selectedId);
            return selectedButton.getText().toString();
        }
        return "NA";
    }

    class EnviaJsonPost extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {
            try {
                String url = "http://192.110.110.106/ifome/cadastra_pedido.php";
                JSONObject jsonValores = new JSONObject();
                jsonValores.put("idusr", 1);
                jsonValores.put("pizza", isPizzaChecked() ? 1 : 0);
                jsonValores.put("tamanho", getSelectedPizzaSize());
                jsonValores.put("sabor", sp_pizza.getSelectedItem().toString());
                jsonValores.put("bebida", isBebidaChecked() ? 1 : 0);
                jsonValores.put("desc_bebida", sp_marcas.getSelectedItem().toString());
                jsonValores.put("tele", getSelectedDeliveryOption());
                jsonValores.put("endereco", edit_endereco.getText().toString().isEmpty() ? "NA" : edit_endereco.getText().toString());

                conexaouniversal mandar = new conexaouniversal();
                return mandar.postJSONObject(url, jsonValores);

            } catch (Exception e) {
                e.printStackTrace();
                return "Erro ao enviar pedido.";
            }
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            if (result != null && !result.equals("Erro ao enviar pedido.")) {
                Toast.makeText(tela_pedidos.this, "Pedido realizado com sucesso!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(tela_pedidos.this, "Erro ao realizar pedido. Tente novamente.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
