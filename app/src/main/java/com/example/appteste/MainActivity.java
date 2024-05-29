package com.example.appteste;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtTituloLivro;
    TextView txtAutor;
    TextView txtEditora;
    TextView txtPagina;
    TextView txtLocalizacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        iniciarComponentesDoLayout();

        criarObjetos();
    }

    private void iniciarComponentesDoLayout() {

        txtAutor = findViewById(R.id.txtAutor);
        txtEditora = findViewById(R.id.txtEditora);
        txtPagina = findViewById(R.id.txtPagina);
        txtTituloLivro = findViewById(R.id.txtTituloLivro);
        txtLocalizacao = findViewById(R.id.txtLocalizacao);

    }

    public void criarObjetos(){

        Livro objLivro = new Livro();

        objLivro.setAutor("Rick Mamona");
        objLivro.setTitulo("POO Encapsulamento");
        objLivro.setEditora("Mamona");
        objLivro.setPaginas(50);
        objLivro.setLocalizacao("L1L2");

        Log.i("POO", "Objeto Livro: Autor: "+objLivro.getAutor());
        Log.i("POO", "Objeto Livro: Titulo: "+objLivro.getTitulo());
        Log.i("POO", "Objeto Livro: Editora: "+objLivro.getEditora());
        Log.i("POO", "Objeto Livro: Pag: "+objLivro.getPaginas());
        Log.i("POO", "Objeto Livro: lOCALOZAÇÃO: "+objLivro.getLocalizacao());

        txtAutor.setText(objLivro.getAutor());
        txtEditora.setText(objLivro.getEditora());
        txtPagina.setText(objLivro.getPaginas()+"");
        txtTituloLivro.setText(objLivro.getTitulo());
        txtLocalizacao.setText(objLivro.getLocalizacao());


    }
}