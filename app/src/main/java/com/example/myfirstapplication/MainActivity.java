package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
// Импортируем все необходимые классы по умолчанию
import android.os.Bundle;
import android.view.View;
// Импортируем все необходимые виджеты для дальнейшей работы с объектами
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	// Объявляем объекты класса и задаём им те имена, что были указаны в файле 'activity_main.xml'
	TextView txtHello;
	Button btnHello;
	ImageView img;
    // Перегрузка метода
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		// Данная строка устанавливает связь между файлами 'activity_main.xml' и 'MainActivity.java'
        setContentView(R.layout.activity_main);
		// Связываем объекты между двумя файлами с помощью метода 'findViewById'
		txtHello = findViewById(R.id.txtHello);
		btnHello = findViewById(R.id.btnHello);
		img = findViewById(R.id.img);
    }
	// Создаём функцию, отвечающую за вывод текста и картинки при нажатии кнопки
	public void onHelloButtonClick(View view) {
		// Передаём объекты и вызываем метод 'setVisibility'
        txtHello.setVisibility(View.VISIBLE);
		img.setVisibility(View.VISIBLE);
		// Метод 'setVisibility' используется для того, чтобы сменить статус видимости объектов при нажатии кнопки
	}
}
