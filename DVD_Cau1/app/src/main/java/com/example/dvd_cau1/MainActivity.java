package com.example.dvd_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edTaiKhoan1,edTaiKhoan2;
    private Button btnLuuThongTin;
    private CheckBox chkLuuThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTaiKhoan1=(EditText)findViewById(R.id.editText_TaiKhoan1);
        edTaiKhoan2=(EditText)findViewById(R.id.editText_TaiKhoan2);
        chkLuuThongTin=(CheckBox)findViewById(R.id.checkBox_LuuThongTin);
        btnLuuThongTin=(Button)findViewById(R.id.button_LuuThongTin);
        btnLuuThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chkLuuThongTin.isChecked()){
                    AlertDialog.Builder log=new AlertDialog.Builder(MainActivity.this);
                    log.setTitle("Thông báo");
                    log.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                    log.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    log.show();
                }else{
                    AlertDialog.Builder log=new AlertDialog.Builder(MainActivity.this);
                    log.setTitle("Thông báo");
                    log.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                    log.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    log.show();
                }
            }
        });
    }
}
